package com.graduation.springboot.mapper;

import com.graduation.springboot.bean.Goods;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface GoodsMapper {
    /*
    商品管理
     */
    //展示商品列表
    @Select("select sku_id,goods_name,list_url,brand,attr_type,price," +
            "discount_price,goods_status,inventory,sold_volumn,add_time,update_time from goods")
    List<Goods> getGoods();

    //根据ID查询商品
    @Select("select * from goods where sku_id=#{skuId}")
    Goods getGoodsById(String skuId);

    //添加商品
    @Insert("insert into goods(sku_id,goods_name,is_onsale,cover_url,list_url,title,sell_point,brand,attr_type,goods_status,inventory,sold_volumn,price,discount_price,add_time,update_time) " +
            "values(#{skuId},#{goodsName},#{isOnsale},#{coverUrl},#{listUrl},#{title},#{sellPoint},#{brand},#{attrType},#{goodsStatus},#{inventory},#{soldVolumn},#{price},#{discountPrice},NOW(),NOW())")
    int insertGoods(Goods goods);

    //修改商品
    @Update("update goods set title = #{title}, sell_point = #{sellPoint,jdbcType=VARCHAR},  goods_name = #{goodsName,jdbcType=CHAR}," +
            "  cover_url = #{coverUrl,jdbcType=VARCHAR},list_url = #{listUrl,jdbcType=VARCHAR}, brand = #{brand,jdbcType=VARCHAR}," +
            "  attr_type = #{attrType,jdbcType=VARCHAR}, price = #{price,jdbcType=DECIMAL}, goods_status = #{goodsStatus,jdbcType=VARCHAR}," +
            " inventory = #{inventory,jdbcType=INTEGER}, sold_volumn = #{soldVolumn,jdbcType=INTEGER}, is_onSale = #{isOnsale,jdbcType=BIT}," +
            "discount_price = #{discountPrice,jdbcType=DECIMAL}, update_time = NOW()" +
            "    where sku_id = #{skuId,jdbcType=CHAR};")
    int updateGoods(Goods goods);


    //删除商品
    @Delete("delete from goods where sku_id=#{skuId}")
    int deleteGoods(String skuId);
}