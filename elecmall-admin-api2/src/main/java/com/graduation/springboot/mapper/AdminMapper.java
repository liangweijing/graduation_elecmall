package com.graduation.springboot.mapper;

import com.graduation.springboot.bean.Admin;
import org.apache.ibatis.annotations.Select;

public interface AdminMapper {
    @Select("select * from admin where username=#{username} and password=#{password}")
    public Admin Login(Admin admin);
}