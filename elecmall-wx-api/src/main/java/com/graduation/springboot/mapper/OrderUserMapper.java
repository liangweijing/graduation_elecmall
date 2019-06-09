package com.graduation.springboot.mapper;

import com.graduation.springboot.bean.OrderUser;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.apache.ibatis.annotations.*;

import java.util.Map;

public interface OrderUserMapper {
    //插入订单
    @Options(useGeneratedKeys = true,keyProperty = "id") //插入时使用自增的属性，对应的是表中id
    @Insert("insert into order_user(id,oid,openid,status,address_id,total_price,coupon_price,pay_time,add_time,update_time)" +
            "VALUES(null,#{oid},#{openid},#{status},#{addressId},#{totalPrice},#{couponPrice},NOW(),NOW(),NOW());")
    int insertOrderUser(OrderUser orderUser);

    //查询订单
    @Select("select * from order_user where oid=#{oid}")
    OrderUser getOrderUser(String oid);

    //根据用户ID，筛选条件(为全部)查询订单,必须和流水联合查询，有商品信息的订单
    @Select("SELECT order_user.id as order_id,status,coupon_price,order_user.total_price from order_user,order_goods" +
            "            where order_user.id=order_goods.order_id and openid=#{openid}")
    @MapKey("order_id")
    Map<Integer, Map<String,Object>> getOrderAllList(@Param("openid") String openid);

    //根据用户ID，筛选条件查询订单,必须和流水联合查询，有商品信息的订单
    @Select("SELECT order_user.id as order_id,status,coupon_price,order_user.total_price from order_user,order_goods" +
            "            where order_user.id=order_goods.order_id and openid=#{openid} and status=#{status}")
    @MapKey("order_id")
    Map<Integer, Map<String,Object>> getOrderList(@Param("openid") String openid,@Param("status") String status);

    //根据订单id查询流水，这里用${orderID}报错
    @Select("select id as ouid,order_id,goods.sku_id,goods.price,discount_price,number,title,sell_point,goods.list_url from goods,order_goods"+
    " where goods.sku_id=order_goods.sku_id and order_id=#{orderID}")
    @MapKey("ouid")
    Map<Integer,Map<String,Object>> getOrderGoodsList(@Param("orderID") Integer orderId);


}