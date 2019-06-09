package com.graduation.springboot.mapper;

import com.graduation.springboot.bean.CouponUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CouponUserMapper {

    //获取用户未使用优惠券
    @Select("select * from coupon_user where  openid=#{openid} and status='未使用'")
    List<CouponUser> getCouponUser(String openid);

    //校验优惠券是否领取过
    @Select("select * from coupon_user where openid=#{arg0} and coupon_id=#{arg1}" )
    CouponUser checkCoupon(String openid,String couponId);

    //插入用户领取的优惠券
    //坑，直接写desc保存因为mysql有个关键字是desc，解决加反引号
    @Insert("insert into coupon_user(id,openid,coupon_id,status,`desc`,discount,num,add_time) " +
            "values(null,#{openid},#{couponId},#{status},#{desc},#{discount},#{num},NOW())")
    int insertCoupon(CouponUser couponUser);
}

