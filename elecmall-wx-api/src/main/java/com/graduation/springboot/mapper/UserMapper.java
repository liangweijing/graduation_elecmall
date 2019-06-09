package com.graduation.springboot.mapper;

import com.graduation.springboot.bean.Address;
import com.graduation.springboot.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Options(useGeneratedKeys = true,keyProperty = "id") //插入时使用自增的属性，对应的是表中id
    @Insert("insert into user values(null,#{nickname},${gender},#{avatarurl},null,#{openid},#{sessionKey},#{addTime},#{loginTime})")
    public int insertUser(User user);

    @Select("select * from user where openid=#{openid}")
    public User getUserByOpenid(String openid);


}