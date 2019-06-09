package com.graduation.springboot.mapper;

import com.graduation.springboot.bean.Address;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

public interface AddressMapper {

    @Select("select id from address")
    List<Address> getAddressNum();

    @Options(useGeneratedKeys = true,keyProperty = "id") //插入时使用自增的属性，对应的是表中id
    @Insert("insert into address values(null,#{openid},#{consignee},#{address},#{detail},${isDefault},#{mobile},NOW(),NOW());")
    public int insertAddress(Address record);

    @Select("select * from address where id=#{id}")
    public Address getAddressById(Integer id);

    @Select("select * from address where openid=#{arg0}  limit ${arg1},3")
    public List<Address> getAddressByOpenid(String openid,int currentPage);

    @Update("update address set consignee=#{consignee},address=#{address},detail=#{detail},is_default=#{isDefault},mobile=#{mobile},update_time=NOW() where id=#{id}; ")
    public int updateAddressById(Address address);

    @Delete("delete from address where id=#{id}")
    public int deleteAddress(int id);
}