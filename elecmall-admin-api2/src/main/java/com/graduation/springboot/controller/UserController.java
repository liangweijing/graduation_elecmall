package com.graduation.springboot.controller;

import com.graduation.springboot.bean.Admin;
import com.graduation.springboot.bean.RespEntity;
import com.graduation.springboot.mapper.AdminMapper;
import com.graduation.springboot.utils.RespUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class UserController {

    @Autowired
    AdminMapper adminMapper;

    @PostMapping("/login")
    @ResponseBody
    public RespEntity Login(@RequestBody Admin admin){

        Admin data=adminMapper.Login(admin);

        if(data!=null){
            return RespUtil.success(null,"登陆成功！");
        }else{
            return RespUtil.error(0,"登录失败！");
        }

    }

}
