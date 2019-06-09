package com.graduation.springboot.utils;

import com.graduation.springboot.bean.RespEnum;

public class ExceptionHandler extends RuntimeException {
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public  ExceptionHandler(RespEnum respEnum, String detailMsg) {
        super(respEnum.getMsg() + detailMsg);//给父类构造方法传入异常信息
        this.code = respEnum.getCode();
    }

}
