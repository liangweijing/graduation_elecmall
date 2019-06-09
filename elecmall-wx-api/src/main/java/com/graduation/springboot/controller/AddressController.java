package com.graduation.springboot.controller;

import com.graduation.springboot.bean.Address;
import com.graduation.springboot.bean.RespEntity;
import com.graduation.springboot.mapper.AddressMapper;
import com.graduation.springboot.utils.RespUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class AddressController {

    @Autowired
  AddressMapper addressMapper;

    /*
    查询地址总数
     */
    @GetMapping("/getAddressNum")
    public RespEntity getAddressNum(){
        List<Address> data=addressMapper.getAddressNum();
        if(!data.isEmpty()){
            return RespUtil.success(data.size(),"获取地址总数成功!");
        }else {
            return RespUtil.error(0,"获取地址总数失败!");
        }
    }

    /*
    添加地址
     */
    @PostMapping("/insertAddress")
    public RespEntity insertAddress(@RequestBody Address address){
        int data=addressMapper.insertAddress(address);
        if(data>0){
            return RespUtil.success(address.getId(),"添加地址成功！");
        }else {
            return  RespUtil.error(0,"添加地址失败！");
        }

    }

    /*
    根据地址ID查找地址
     */
    @GetMapping("/getAddress")
    public RespEntity getAddressById(@RequestParam Integer id){
        Address address=addressMapper.getAddressById(id);
        if(address!=null){
            return RespUtil.success(address,"获取收货地址成功！");
        }else {
            return RespUtil.error(0,"获取收货地址失败！");
        }
    }

    /*
    根据用户openid查找地址列表
     */
    @GetMapping("/getAddressByOpenid")
    public RespEntity getAddressByOpenid(@RequestParam String openid,@RequestParam int currentPage){
        currentPage=--currentPage*3;
        List<Address>  data=addressMapper.getAddressByOpenid(openid,currentPage);
        if(!data.isEmpty()){
            return RespUtil.success(data,"获取地址列表成功！");
        }else{
            return  RespUtil.error(0,"获取地址列表失败！");
        }
    }

    /*
    跟新编辑地址
     */
    @PostMapping("/updateAddress")
    public RespEntity updateAddress(@RequestBody Address address){
        int data =addressMapper.updateAddressById(address);
        if(data>0){
            return RespUtil.success(1,"地址更新成功!");
        }else{
            return RespUtil.error(0,"地址更新失败!");
        }
    }

    //根据ID删除地址
    @GetMapping("/deleteAddress")
    public RespEntity deleteAddress(@RequestParam int id){
        int data=addressMapper.deleteAddress(id);
        if(data>0){
            return RespUtil.success(data,"删除地址成功!");
        }else {
            return  RespUtil.error(0,"删除地址失败！");
        }
    }

}
