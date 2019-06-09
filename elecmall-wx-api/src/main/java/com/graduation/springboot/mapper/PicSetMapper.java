package com.graduation.springboot.mapper;

import com.graduation.springboot.bean.PicSet;

public interface PicSetMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PicSet record);

    int insertSelective(PicSet record);

    PicSet selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PicSet record);

    int updateByPrimaryKey(PicSet record);
}