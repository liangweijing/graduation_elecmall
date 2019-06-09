package com.graduation.springboot.mapper;

import com.graduation.springboot.bean.Coupon;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CouponMapper {
    //获取九宫格优惠券
//    @Select("select * from coupon where NOW()<deadline")
    @Select("select * from coupon")
    List<Coupon> getCoupon();
}