package com.graduation.springboot.mapper;

import com.graduation.springboot.bean.Coupon;
import com.graduation.springboot.bean.Goods;
import com.graduation.springboot.bean.PicSet;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface GoodsMapper {
    /*
    首页
     */

    //获取首页轮播
    @Select("select sku_id,goods_name,cover_url from goods limit 0,3")
    List<Goods> getIndexSwiper();

    //获取九宫格前三宫格每格总条数
    @Select("select * from goods where goods_name=#{arg0}")
    List<Goods> getTotalPage(String name);

    //获取九宫格商品列表
    @Select("select * from goods where goods_name=#{arg0} order by ${arg1} desc limit ${arg2},2")
    List<Goods> getGrideProductList(String searchName,String filterName,int currentPage);


    //获取九宫格特卖列表
    @Select("select * from goods where is_onSale=1")
    List<Goods> getOnSale();


    //获取九宫格热卖列表
    @Select("select * from goods order by sold_volumn desc limit ${currentPage} 8")
    List<Goods> getHotSale(int currentPage);

    //获取九宫格精选列表
    @Select("select * from goods where is_choiceness=1")
    List<Goods> getChoiceness();

    //获取九宫格优惠券
    @Select("select * from coupon where NOW()<deadline")
    List<Coupon> getCoupon();

    /*
    商品详情
     */
    //根据ID获取商品详情
    @Select("select * from goods where sku_id=#{id}")
    List<Goods> getGoodsDetail(String id);

    //多表查询商品轮播图
    @Select("select * from pic_set,goods where pic_set.id=goods.picSet_id and goods.sku_id=#{id}")
    List<PicSet> getGoodsSwiper(String id);



    /*
    搜索页
     */
    //根据搜索关键词匹配
    @Select("select * from goods where title LIKE CONCAT('%',#{arg0},'%') order by ${arg1} desc")
    List<Goods> searchGoods(String searchMsg,String filterName);

    //获取分类跳转商品列表
    @Select("select * from goods where goods_name=#{arg0} and brand=#{arg1} order by ${arg2} desc ")
    List<Goods> getClassifyProductList(String searchName,String brand,String filterName);
}