package com.graduation.springboot.bean;

public class PicSet {
    private Integer id;

    private String swiper1;

    private String swiper2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSwiper1() {
        return swiper1;
    }

    public void setSwiper1(String swiper1) {
        this.swiper1 = swiper1 == null ? null : swiper1.trim();
    }

    public String getSwiper2() {
        return swiper2;
    }

    public void setSwiper2(String swiper2) {
        this.swiper2 = swiper2 == null ? null : swiper2.trim();
    }
}