package com.graduation.springboot.bean;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Date;

public class Goods {
    private String skuId;

    private String title;

    private String sellPoint;

    private String goodsName;

    private Integer categoryId;

    private String listUrl;

    private String coverUrl;

    private Integer picsetId;

    private String brand;

    private String attrSize;

    private String attrType;

    private String attrColor;

    private String attrTexture;

    private BigDecimal price;

    private String goodsStatus;

    private Integer inventory;

    private Integer soldVolumn;

    private Integer isChoiceness;

    private Integer isOnsale;

    private BigDecimal discountPrice;

    private Date addTime;

    private Date updateTime;

    private String detail;

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId == null ? null : skuId.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSellPoint() {
        return sellPoint;
    }

    public void setSellPoint(String sellPoint) {
        this.sellPoint = sellPoint == null ? null : sellPoint.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getLIstUrl() {
        return listUrl;
    }

    public void setLIstUrl(String listUrl) {
        this.listUrl = listUrl == null ? null : listUrl.trim();
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl == null ? null : coverUrl.trim();
    }
    public Integer getPicsetId() {
        return picsetId;
    }

    public void setPicsetId(Integer picsetId) {
        this.picsetId = picsetId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getAttrSize() {
        return attrSize;
    }

    public void setAttrSize(String attrSize) {
        this.attrSize = attrSize == null ? null : attrSize.trim();
    }

    public String getAttrType() {
        return attrType;
    }

    public void setAttrType(String attrType) {
        this.attrType = attrType == null ? null : attrType.trim();
    }

    public String getAttrColor() {
        return attrColor;
    }

    public void setAttrColor(String attrColor) {
        this.attrColor = attrColor == null ? null : attrColor.trim();
    }

    public String getAttrTexture() {
        return attrTexture;
    }

    public void setAttrTexture(String attrTexture) {
        this.attrTexture = attrTexture == null ? null : attrTexture.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(String goodsStatus) {
        this.goodsStatus = goodsStatus == null ? null : goodsStatus.trim();
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public Integer getSoldVolumn() {
        return soldVolumn;
    }

    public void setSoldVolumn(Integer soldVolumn) {
        this.soldVolumn = soldVolumn;
    }

    public Integer getIsChoiceness() {
        return isChoiceness;
    }

    public void setIsChoiceness(Integer isChoiceness) {
        this.isChoiceness = isChoiceness;
    }

    public Integer getIsOnsale() {
        return isOnsale;
    }

    public void setIsOnsale(Integer isOnsale) {
        this.isOnsale = isOnsale;
    }

    public BigDecimal getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(BigDecimal discountPrice) {
        this.discountPrice = discountPrice;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }
}