package com.graduation.springboot.controller;

import com.graduation.springboot.bean.*;
import com.graduation.springboot.mapper.CategoryMapper;
import com.graduation.springboot.mapper.CouponMapper;
import com.graduation.springboot.mapper.GoodsMapper;
import com.graduation.springboot.utils.ExceptionHandler;
import com.graduation.springboot.utils.Page;
import com.graduation.springboot.utils.RespUtil;
import com.sun.xml.internal.ws.handler.HandlerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class GoodsController {
    @Autowired
    GoodsMapper goodsMapper;

    @Autowired
    CouponMapper couponMapper;

    @Autowired
    CategoryMapper categoryMapper;
/*
首页
 */
    //查询前三条展示轮播
    @GetMapping("/getIndexSwiper")
    public RespEntity getTopThree(){

        List<Goods> data=goodsMapper.getIndexSwiper();
//        if (bindingResult.hasErrors()) {
//            return ResultUtil.error(1, bindingResult.getFieldError().getDefaultMessage());
//        }
//        throw new ExceptionHandler(RespEnum.CODE_800000,"");
        return RespUtil.success(data,"首页轮播图获取成功");
        //        return  new RespEntity(RespEnum.SUCCESS, data);
    }

    //九宫格分页总条数
    @GetMapping("/getTotalPage")
    public  RespEntity getTotalPage(@RequestParam String name){
        List<Goods> data=goodsMapper.getTotalPage(name);
        if(!data.isEmpty()){
            return RespUtil.success(data.size(),"获取总条数成功!");
        }else{
            return  RespUtil.error(0,"获取总条数失败!");
        }
    }


   //九宫格商品列表
    @GetMapping ("/grideGoods")
    public RespEntity getGrideProductList(@RequestParam String searchName,@RequestParam(required=false) String brand,@RequestParam(required=false) String filterName,@RequestParam(required=false) int currentPage) {
//        链接上加上参数http://127.0.0.1:8080/grideGoods?searchName=电饭锅
        switch (filterName){
            case "newgoods":
                filterName="update_time";
                break;
            case "volumn":
                filterName="sold_volumn";
                break;
            case "synthesize":
                filterName="inventory";
                break;
        }
        List<Goods> data;
        currentPage=--currentPage*2;
        if(brand!="" && brand!=null){
            //分类页跳转商品列表
           data=goodsMapper.getClassifyProductList(searchName,brand,filterName);
        }else{
            //九宫格跳转商品列表
             data=goodsMapper.getGrideProductList(searchName,filterName,currentPage);
        }


        if(data.size()==0 || data.isEmpty() || data==null){
         return   RespUtil.error(0,"暂无数据，搜索或筛选出错");
        }
        return RespUtil.success(data,searchName+"列表获取成功");
    }

    //九宫格特卖列表
    @GetMapping("/grideOnSale")
    public RespEntity getOnSale(){
        List<Goods> data=goodsMapper.getOnSale();
        if(data.size()==0){
            return RespUtil.error(0,"暂无特卖数据");
        }
        return RespUtil.success(data,"获取特卖列表成功");
    }

    //九宫格热卖列表
    @GetMapping("/grideHotSale")
    public RespEntity getHotSale(@RequestParam int currentPage){
        currentPage=--currentPage*8;
        List<Goods> data=goodsMapper.getHotSale(currentPage);
        if(data.size()==0){
            return RespUtil.error(0,"暂无数据");
        }
        return RespUtil.success(data,"获取热卖列表成功");
    }

    //九宫格优惠券列表
    @GetMapping("/grideCoupon")
    public RespEntity getCoupon(){
        List<Coupon> data=couponMapper.getCoupon();
        if(data.isEmpty()){
            return RespUtil.error(0,"暂无数据");
        }
        return RespUtil.success(data,"获取优惠券列表成功");
    }

    //精选产品
    @GetMapping("/grideChoiceness")
    public RespEntity getChoiceness(){
        List<Goods> data=goodsMapper.getChoiceness();
        if(data.size()==0){
            return RespUtil.error(0,"暂无数据");
        }
        return RespUtil.success(data,"获取精选产品成功");
    }

    /*
    商品详情
     */
    //根据ID获取商品信息
    @GetMapping("/goodsDetail")
    public RespEntity getGoodsDetail(@RequestParam String id){
        List<Goods> data=goodsMapper.getGoodsDetail(id);
        if(data.isEmpty()){
            return RespUtil.error(0,"获取商品信息出错，ID可能错误！");
        }
        return RespUtil.success(data,"获取商品信息成功！");
    }

    //根据ID获取商品轮播图
    @GetMapping("/goodsSwiper")
    public RespEntity getGoodsSwiper(@RequestParam String id){
        List<PicSet> data=goodsMapper.getGoodsSwiper(id);
        if(data.size()<1){
            return RespUtil.error(0,"暂无数据！");
        }
        return RespUtil.success(data,"获取商品详情轮播图成功！");
    }

    /*
    搜索页
     */
    //搜索商品
    @GetMapping("/searchGoods")
    public RespEntity searchGoods(@RequestParam String searchMsg,@RequestParam String filterName) {
        //例如搜索"电水壶abc"，若第一次没搜索到，依次剔除最后一个字符串进行查找，找到立即返回
        switch (filterName) {
            case "newgoods":
                filterName = "update_time";
                break;
            case "volumn":
                filterName = "sold_volumn";
                break;
            case "synthesize":
                filterName = "inventory";
                break;
        }
        int length = searchMsg.length();
        while (length > 0) {
            List<Goods> data = goodsMapper.searchGoods(searchMsg, filterName);
            if (!data.isEmpty()) {
                return RespUtil.success(data, "搜索成功！");
            } else {
                --length;
                searchMsg = searchMsg.substring(0, length);

            }
        }
        //若执行到这里说明整个字符串都找过了没有
        return RespUtil.error(0, "搜索失败！");
    }
        /*
        分类页
         */
        @GetMapping("/getCategory")
        public RespEntity getCategory(){
            Map<Integer,Map<String,Object>> map=categoryMapper.getCategory();
            List<Map<String,Object>> data=new ArrayList<>();
            for (Map.Entry<Integer,Map<String,Object>> entry : map.entrySet()) {
//                System.out.println("左侧栏"+entry.getKey()+":"+entry.getValue());
                data.add(entry.getValue());
            }

            if(map.size()>0){
                //若直接输出Map整个都是对象，输出List就是数组
//                return RespUtil.success(map,"获取左侧栏分类信息成功！");
                return RespUtil.success(data,"获取左侧栏分类信息成功！");
            }else{
                return RespUtil.error(0,"获取左侧栏分类信息失败！");
            }
        }
        @GetMapping("/getCategoryDetail")
        public RespEntity getCategoryDetail(){
            Map<Integer,Map<String,Object>> map=categoryMapper.getCategoryDetail();
            List<Map<String,Object>> data=new ArrayList<>();
            for (Map.Entry<Integer,Map<String,Object>> entry : map.entrySet()) {
//                System.out.println("右侧栏"+entry.getKey()+":"+entry.getValue());
                data.add(entry.getValue());
            }
            if(map.size()>0){
                return RespUtil.success(data,"获取右侧栏分类信息成功！");
            }else{
                return RespUtil.error(0,"获取右侧栏分类信息失败！");
            }
        }

}

