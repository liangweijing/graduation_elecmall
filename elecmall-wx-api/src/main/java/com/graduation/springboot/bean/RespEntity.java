package com.graduation.springboot.bean;
//相应规范实体类
public class RespEntity<T> {
    //这里的排序关系的返回数据排序
    private int code = 1; //状态码，1：成功，0：失败
    private String msg = ""; //描述信息
    private T data; //服务端数据



    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
