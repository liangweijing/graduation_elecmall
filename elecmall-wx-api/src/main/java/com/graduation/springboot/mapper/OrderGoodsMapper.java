package com.graduation.springboot.mapper;

import com.graduation.springboot.bean.OrderGoods;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OrderGoodsMapper {
    //插入流水
    @Insert("insert into order_goods(id,order_id,sku_id,goods_name,list_url,number,total_price,price,add_time,update_time)" +
            "VALUES(null,#{orderId},#{skuId},#{goodsName},#{listUrl},#{number},#{totalPrice},#{price},NOW(),NOW());")
    int insertOrderGoods(OrderGoods orderGoods);

    //查询流水
    @Select("select * from order_goods where order_id=#{orderId} ")
    List<OrderGoods> getOrderGoods(String orderId);
}