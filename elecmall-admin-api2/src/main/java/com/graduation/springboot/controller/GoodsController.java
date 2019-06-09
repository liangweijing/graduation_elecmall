package com.graduation.springboot.controller;

import com.graduation.springboot.bean.Goods;
import com.graduation.springboot.bean.RespEntity;
import com.graduation.springboot.mapper.GoodsMapper;
import com.graduation.springboot.utils.RespUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.text.DecimalFormat;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/admin")
public class GoodsController {
    @Autowired
    GoodsMapper goodsMapper;
/*
商品管理
 */
//查询商品，展示商品列表
    @GetMapping("/getGoods")
    public RespEntity getGoods(){
        List<Goods> data=goodsMapper.getGoods();
        if(!data.isEmpty()){
            return RespUtil.success(data,"获取所有商品信息成功！");
        }else{
            return RespUtil.error(0,"获取所有商品信息失败！");
        }
    }

    //根据商品ID查询商品
    @GetMapping("/getGoodsById")
    public  RespEntity getGoodsById(@RequestParam String skuId){
        Goods data=goodsMapper.getGoodsById(skuId);
        if(data!=null){
            return RespUtil.success(data,"查询商品成功!");
        }else{
            return RespUtil.error(0,"查询商品失败！");
        }
    }

    //上传图片
    @PostMapping("/upload")
    public RespEntity upload(@RequestParam("file") MultipartFile fileUpload){

        //获取文件名
        String fileName = fileUpload.getOriginalFilename();
        System.out.println(fileName);
        //获取文件后缀名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        //重新生成文件名
        fileName = UUID.randomUUID()+suffixName;
        //指定本地文件夹存储图片
        String filePath = "F:/liangwj/elecmall/wx/static/images/";

        try {
            //将图片保存到static文件夹里
            fileUpload.transferTo(new File(filePath+fileName));
            return RespUtil.success(fileName,"上传图片成功!");
        } catch (Exception e) {
            e.printStackTrace();
            return  RespUtil.error(0,"上传图片失败");
        }
    }

    //插入商品
    @PostMapping("/insertGoods")
    public  RespEntity insertGoods(@RequestBody Goods goods){
//        if(goods.getDiscountPrice()>0){
//            goods.setIsOnsale(1);
//            goods.setIsChoiceness(1);
//        }

        int data=goodsMapper.insertGoods(goods);
        if(data>0){
            return RespUtil.success(data,"插入成功!");
        }else{
            return  RespUtil.error(0,"插入失败！!");
        }
    }


    //修改商品
    @PostMapping("/updateGoods")
    public RespEntity updateGoods(@RequestBody Goods goods){
        int data=goodsMapper.updateGoods(goods);
        if(data>0){
            return  RespUtil.success(data,"修改商品成功！");
        }else{
            return RespUtil.error(0,"修改商品失败！");
        }
    }


    //删除商品
    @GetMapping("/deleteGoods")
    public  RespEntity deleteGoods(@RequestParam String skuId){
        int data=goodsMapper.deleteGoods(skuId);
        if(data>0){
            return RespUtil.success(data,"删除商品成功！");
        }else{
            return  RespUtil.error(0,"删除商品失败！");
        }
    }
}
