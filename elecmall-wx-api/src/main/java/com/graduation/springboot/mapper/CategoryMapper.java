package com.graduation.springboot.mapper;

import com.graduation.springboot.bean.Category;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

public interface CategoryMapper {
    /*
    分类页
     */
    //获取左侧栏商品种类名数据
    @Select("select id,name from category group by name order by id asc")
    @MapKey("id")
    public Map<Integer,Map<String,Object>> getCategory();


    //获取右侧栏细节
    @Select("select id,name,banner,brand,list_url from category order by id asc")
    @MapKey("id")
    public Map<Integer,Map<String,Object>> getCategoryDetail();
}