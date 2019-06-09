package com.graduation.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(value = "com.graduation.springboot.mapper")
@SpringBootApplication
public class ElecmallAdminApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElecmallAdminApiApplication.class, args);
    }

}
