package com.graduation.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan(value = "com.graduation.springboot.mapper")
@SpringBootApplication
@EnableTransactionManagement
public class ElecmallWxApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElecmallWxApiApplication.class, args);
    }

}
