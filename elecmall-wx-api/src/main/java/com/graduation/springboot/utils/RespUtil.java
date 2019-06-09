package com.graduation.springboot.utils;

import com.graduation.springboot.bean.RespEntity;

public class RespUtil {
//请求响应
        public static RespEntity success(Object object,String msg) {
            RespEntity result = new RespEntity();
            result.setCode(1);
            result.setMsg(msg);
            result.setData(object);
            return result;
        }

        public static RespEntity success() {
            return success(null,"成功");
        }

        public static RespEntity error(Integer code, String msg) {
            RespEntity result = new RespEntity();
            result.setCode(code);
            result.setMsg(msg);
            return result;
        }

    }
