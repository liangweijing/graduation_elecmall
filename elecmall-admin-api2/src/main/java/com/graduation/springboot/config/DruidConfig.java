package com.graduation.springboot.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class DruidConfig {

    //将spring.datasource为前缀的所有属性绑定进来
    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource druid(){
        return  new DruidDataSource();
    }

    //配置Druid的监控,访问localhost:8080/druid
    //1、配置一个管理后台的Servlet：处理进入后台的请求
    @Bean//没有配置文件，springboot注册servlet（三大组件）的方式
    public ServletRegistrationBean statViewServlet(){
        //处理此路径下所有请求
        ServletRegistrationBean bean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
        Map<String,String> initParams = new HashMap<>();
        //servlet的初始化参数
        initParams.put("loginUsername","admin");//登录后台时用户名
        initParams.put("loginPassword","123456");
        initParams.put("allow","");//默认就是允许所有访问initParams.put("allow","localhost");仅允许localhost访问
        initParams.put("deny","192.168.15.21");

        bean.setInitParameters(initParams);
        return bean;
    }


    //2、配置一个web监控的filter
    @Bean
    public FilterRegistrationBean webStatFilter(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new WebStatFilter());

        Map<String,String> initParams = new HashMap<>();
        initParams.put("exclusions","*.js,*.css,/druid/*");//不过滤

        bean.setInitParameters(initParams);

        bean.setUrlPatterns(Arrays.asList("/*"));//参数时集合

        return  bean;
    }
}
