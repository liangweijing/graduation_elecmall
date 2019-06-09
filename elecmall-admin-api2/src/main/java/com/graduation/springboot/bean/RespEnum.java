package com.graduation.springboot.bean;
//接口响应状态码枚举类
public enum RespEnum {
//    SUCCESS(1, "请求成功"),
//    WARN(0, "请求失败");

    //**********  异常  ************
    CODE_800000("800000", "系统异常！"),
    CODE_800002("800002", "参数处理异常！"),
    CODE_800003("800003", "业务系统调用异常！"),

    //**********  失败  ************
    CODE_800001("800010", "参数校验失败！"),
    CODE_800010("800011", "业务系统调用失败！"),

    //**********  成功  ************
    CODE_9999("9999", "业务系统调用成功！"),
    CODE_999999("999999", "交易成功！");

    private String code;
    private String msg;

    RespEnum(){}
    RespEnum(String code, String msg) {
        this.code=code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }
    public String getMsg() {
        return msg;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
