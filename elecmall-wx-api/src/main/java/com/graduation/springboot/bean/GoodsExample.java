package com.graduation.springboot.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSkuIdIsNull() {
            addCriterion("sku_id is null");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNotNull() {
            addCriterion("sku_id is not null");
            return (Criteria) this;
        }

        public Criteria andSkuIdEqualTo(String value) {
            addCriterion("sku_id =", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotEqualTo(String value) {
            addCriterion("sku_id <>", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThan(String value) {
            addCriterion("sku_id >", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThanOrEqualTo(String value) {
            addCriterion("sku_id >=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThan(String value) {
            addCriterion("sku_id <", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThanOrEqualTo(String value) {
            addCriterion("sku_id <=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLike(String value) {
            addCriterion("sku_id like", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotLike(String value) {
            addCriterion("sku_id not like", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdIn(List<String> values) {
            addCriterion("sku_id in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotIn(List<String> values) {
            addCriterion("sku_id not in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdBetween(String value1, String value2) {
            addCriterion("sku_id between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotBetween(String value1, String value2) {
            addCriterion("sku_id not between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andSellPointIsNull() {
            addCriterion("sell_point is null");
            return (Criteria) this;
        }

        public Criteria andSellPointIsNotNull() {
            addCriterion("sell_point is not null");
            return (Criteria) this;
        }

        public Criteria andSellPointEqualTo(String value) {
            addCriterion("sell_point =", value, "sellPoint");
            return (Criteria) this;
        }

        public Criteria andSellPointNotEqualTo(String value) {
            addCriterion("sell_point <>", value, "sellPoint");
            return (Criteria) this;
        }

        public Criteria andSellPointGreaterThan(String value) {
            addCriterion("sell_point >", value, "sellPoint");
            return (Criteria) this;
        }

        public Criteria andSellPointGreaterThanOrEqualTo(String value) {
            addCriterion("sell_point >=", value, "sellPoint");
            return (Criteria) this;
        }

        public Criteria andSellPointLessThan(String value) {
            addCriterion("sell_point <", value, "sellPoint");
            return (Criteria) this;
        }

        public Criteria andSellPointLessThanOrEqualTo(String value) {
            addCriterion("sell_point <=", value, "sellPoint");
            return (Criteria) this;
        }

        public Criteria andSellPointLike(String value) {
            addCriterion("sell_point like", value, "sellPoint");
            return (Criteria) this;
        }

        public Criteria andSellPointNotLike(String value) {
            addCriterion("sell_point not like", value, "sellPoint");
            return (Criteria) this;
        }

        public Criteria andSellPointIn(List<String> values) {
            addCriterion("sell_point in", values, "sellPoint");
            return (Criteria) this;
        }

        public Criteria andSellPointNotIn(List<String> values) {
            addCriterion("sell_point not in", values, "sellPoint");
            return (Criteria) this;
        }

        public Criteria andSellPointBetween(String value1, String value2) {
            addCriterion("sell_point between", value1, value2, "sellPoint");
            return (Criteria) this;
        }

        public Criteria andSellPointNotBetween(String value1, String value2) {
            addCriterion("sell_point not between", value1, value2, "sellPoint");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Integer value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Integer value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Integer value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Integer value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Integer> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Integer> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCoverUrlIsNull() {
            addCriterion("cover_url is null");
            return (Criteria) this;
        }

        public Criteria andCoverUrlIsNotNull() {
            addCriterion("cover_url is not null");
            return (Criteria) this;
        }

        public Criteria andCoverUrlEqualTo(String value) {
            addCriterion("cover_url =", value, "coverUrl");
            return (Criteria) this;
        }

        public Criteria andCoverUrlNotEqualTo(String value) {
            addCriterion("cover_url <>", value, "coverUrl");
            return (Criteria) this;
        }

        public Criteria andCoverUrlGreaterThan(String value) {
            addCriterion("cover_url >", value, "coverUrl");
            return (Criteria) this;
        }

        public Criteria andCoverUrlGreaterThanOrEqualTo(String value) {
            addCriterion("cover_url >=", value, "coverUrl");
            return (Criteria) this;
        }

        public Criteria andCoverUrlLessThan(String value) {
            addCriterion("cover_url <", value, "coverUrl");
            return (Criteria) this;
        }

        public Criteria andCoverUrlLessThanOrEqualTo(String value) {
            addCriterion("cover_url <=", value, "coverUrl");
            return (Criteria) this;
        }

        public Criteria andCoverUrlLike(String value) {
            addCriterion("cover_url like", value, "coverUrl");
            return (Criteria) this;
        }

        public Criteria andCoverUrlNotLike(String value) {
            addCriterion("cover_url not like", value, "coverUrl");
            return (Criteria) this;
        }

        public Criteria andCoverUrlIn(List<String> values) {
            addCriterion("cover_url in", values, "coverUrl");
            return (Criteria) this;
        }

        public Criteria andCoverUrlNotIn(List<String> values) {
            addCriterion("cover_url not in", values, "coverUrl");
            return (Criteria) this;
        }

        public Criteria andCoverUrlBetween(String value1, String value2) {
            addCriterion("cover_url between", value1, value2, "coverUrl");
            return (Criteria) this;
        }

        public Criteria andCoverUrlNotBetween(String value1, String value2) {
            addCriterion("cover_url not between", value1, value2, "coverUrl");
            return (Criteria) this;
        }

        public Criteria andPicsetIdIsNull() {
            addCriterion("picSet_id is null");
            return (Criteria) this;
        }

        public Criteria andPicsetIdIsNotNull() {
            addCriterion("picSet_id is not null");
            return (Criteria) this;
        }

        public Criteria andPicsetIdEqualTo(Integer value) {
            addCriterion("picSet_id =", value, "picsetId");
            return (Criteria) this;
        }

        public Criteria andPicsetIdNotEqualTo(Integer value) {
            addCriterion("picSet_id <>", value, "picsetId");
            return (Criteria) this;
        }

        public Criteria andPicsetIdGreaterThan(Integer value) {
            addCriterion("picSet_id >", value, "picsetId");
            return (Criteria) this;
        }

        public Criteria andPicsetIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("picSet_id >=", value, "picsetId");
            return (Criteria) this;
        }

        public Criteria andPicsetIdLessThan(Integer value) {
            addCriterion("picSet_id <", value, "picsetId");
            return (Criteria) this;
        }

        public Criteria andPicsetIdLessThanOrEqualTo(Integer value) {
            addCriterion("picSet_id <=", value, "picsetId");
            return (Criteria) this;
        }

        public Criteria andPicsetIdIn(List<Integer> values) {
            addCriterion("picSet_id in", values, "picsetId");
            return (Criteria) this;
        }

        public Criteria andPicsetIdNotIn(List<Integer> values) {
            addCriterion("picSet_id not in", values, "picsetId");
            return (Criteria) this;
        }

        public Criteria andPicsetIdBetween(Integer value1, Integer value2) {
            addCriterion("picSet_id between", value1, value2, "picsetId");
            return (Criteria) this;
        }

        public Criteria andPicsetIdNotBetween(Integer value1, Integer value2) {
            addCriterion("picSet_id not between", value1, value2, "picsetId");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andAttrSizeIsNull() {
            addCriterion("attr_size is null");
            return (Criteria) this;
        }

        public Criteria andAttrSizeIsNotNull() {
            addCriterion("attr_size is not null");
            return (Criteria) this;
        }

        public Criteria andAttrSizeEqualTo(String value) {
            addCriterion("attr_size =", value, "attrSize");
            return (Criteria) this;
        }

        public Criteria andAttrSizeNotEqualTo(String value) {
            addCriterion("attr_size <>", value, "attrSize");
            return (Criteria) this;
        }

        public Criteria andAttrSizeGreaterThan(String value) {
            addCriterion("attr_size >", value, "attrSize");
            return (Criteria) this;
        }

        public Criteria andAttrSizeGreaterThanOrEqualTo(String value) {
            addCriterion("attr_size >=", value, "attrSize");
            return (Criteria) this;
        }

        public Criteria andAttrSizeLessThan(String value) {
            addCriterion("attr_size <", value, "attrSize");
            return (Criteria) this;
        }

        public Criteria andAttrSizeLessThanOrEqualTo(String value) {
            addCriterion("attr_size <=", value, "attrSize");
            return (Criteria) this;
        }

        public Criteria andAttrSizeLike(String value) {
            addCriterion("attr_size like", value, "attrSize");
            return (Criteria) this;
        }

        public Criteria andAttrSizeNotLike(String value) {
            addCriterion("attr_size not like", value, "attrSize");
            return (Criteria) this;
        }

        public Criteria andAttrSizeIn(List<String> values) {
            addCriterion("attr_size in", values, "attrSize");
            return (Criteria) this;
        }

        public Criteria andAttrSizeNotIn(List<String> values) {
            addCriterion("attr_size not in", values, "attrSize");
            return (Criteria) this;
        }

        public Criteria andAttrSizeBetween(String value1, String value2) {
            addCriterion("attr_size between", value1, value2, "attrSize");
            return (Criteria) this;
        }

        public Criteria andAttrSizeNotBetween(String value1, String value2) {
            addCriterion("attr_size not between", value1, value2, "attrSize");
            return (Criteria) this;
        }

        public Criteria andAttrTypeIsNull() {
            addCriterion("attr_type is null");
            return (Criteria) this;
        }

        public Criteria andAttrTypeIsNotNull() {
            addCriterion("attr_type is not null");
            return (Criteria) this;
        }

        public Criteria andAttrTypeEqualTo(String value) {
            addCriterion("attr_type =", value, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeNotEqualTo(String value) {
            addCriterion("attr_type <>", value, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeGreaterThan(String value) {
            addCriterion("attr_type >", value, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeGreaterThanOrEqualTo(String value) {
            addCriterion("attr_type >=", value, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeLessThan(String value) {
            addCriterion("attr_type <", value, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeLessThanOrEqualTo(String value) {
            addCriterion("attr_type <=", value, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeLike(String value) {
            addCriterion("attr_type like", value, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeNotLike(String value) {
            addCriterion("attr_type not like", value, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeIn(List<String> values) {
            addCriterion("attr_type in", values, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeNotIn(List<String> values) {
            addCriterion("attr_type not in", values, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeBetween(String value1, String value2) {
            addCriterion("attr_type between", value1, value2, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeNotBetween(String value1, String value2) {
            addCriterion("attr_type not between", value1, value2, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrColorIsNull() {
            addCriterion("attr_color is null");
            return (Criteria) this;
        }

        public Criteria andAttrColorIsNotNull() {
            addCriterion("attr_color is not null");
            return (Criteria) this;
        }

        public Criteria andAttrColorEqualTo(String value) {
            addCriterion("attr_color =", value, "attrColor");
            return (Criteria) this;
        }

        public Criteria andAttrColorNotEqualTo(String value) {
            addCriterion("attr_color <>", value, "attrColor");
            return (Criteria) this;
        }

        public Criteria andAttrColorGreaterThan(String value) {
            addCriterion("attr_color >", value, "attrColor");
            return (Criteria) this;
        }

        public Criteria andAttrColorGreaterThanOrEqualTo(String value) {
            addCriterion("attr_color >=", value, "attrColor");
            return (Criteria) this;
        }

        public Criteria andAttrColorLessThan(String value) {
            addCriterion("attr_color <", value, "attrColor");
            return (Criteria) this;
        }

        public Criteria andAttrColorLessThanOrEqualTo(String value) {
            addCriterion("attr_color <=", value, "attrColor");
            return (Criteria) this;
        }

        public Criteria andAttrColorLike(String value) {
            addCriterion("attr_color like", value, "attrColor");
            return (Criteria) this;
        }

        public Criteria andAttrColorNotLike(String value) {
            addCriterion("attr_color not like", value, "attrColor");
            return (Criteria) this;
        }

        public Criteria andAttrColorIn(List<String> values) {
            addCriterion("attr_color in", values, "attrColor");
            return (Criteria) this;
        }

        public Criteria andAttrColorNotIn(List<String> values) {
            addCriterion("attr_color not in", values, "attrColor");
            return (Criteria) this;
        }

        public Criteria andAttrColorBetween(String value1, String value2) {
            addCriterion("attr_color between", value1, value2, "attrColor");
            return (Criteria) this;
        }

        public Criteria andAttrColorNotBetween(String value1, String value2) {
            addCriterion("attr_color not between", value1, value2, "attrColor");
            return (Criteria) this;
        }

        public Criteria andAttrTextureIsNull() {
            addCriterion("attr_texture is null");
            return (Criteria) this;
        }

        public Criteria andAttrTextureIsNotNull() {
            addCriterion("attr_texture is not null");
            return (Criteria) this;
        }

        public Criteria andAttrTextureEqualTo(String value) {
            addCriterion("attr_texture =", value, "attrTexture");
            return (Criteria) this;
        }

        public Criteria andAttrTextureNotEqualTo(String value) {
            addCriterion("attr_texture <>", value, "attrTexture");
            return (Criteria) this;
        }

        public Criteria andAttrTextureGreaterThan(String value) {
            addCriterion("attr_texture >", value, "attrTexture");
            return (Criteria) this;
        }

        public Criteria andAttrTextureGreaterThanOrEqualTo(String value) {
            addCriterion("attr_texture >=", value, "attrTexture");
            return (Criteria) this;
        }

        public Criteria andAttrTextureLessThan(String value) {
            addCriterion("attr_texture <", value, "attrTexture");
            return (Criteria) this;
        }

        public Criteria andAttrTextureLessThanOrEqualTo(String value) {
            addCriterion("attr_texture <=", value, "attrTexture");
            return (Criteria) this;
        }

        public Criteria andAttrTextureLike(String value) {
            addCriterion("attr_texture like", value, "attrTexture");
            return (Criteria) this;
        }

        public Criteria andAttrTextureNotLike(String value) {
            addCriterion("attr_texture not like", value, "attrTexture");
            return (Criteria) this;
        }

        public Criteria andAttrTextureIn(List<String> values) {
            addCriterion("attr_texture in", values, "attrTexture");
            return (Criteria) this;
        }

        public Criteria andAttrTextureNotIn(List<String> values) {
            addCriterion("attr_texture not in", values, "attrTexture");
            return (Criteria) this;
        }

        public Criteria andAttrTextureBetween(String value1, String value2) {
            addCriterion("attr_texture between", value1, value2, "attrTexture");
            return (Criteria) this;
        }

        public Criteria andAttrTextureNotBetween(String value1, String value2) {
            addCriterion("attr_texture not between", value1, value2, "attrTexture");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusIsNull() {
            addCriterion("goods_status is null");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusIsNotNull() {
            addCriterion("goods_status is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusEqualTo(String value) {
            addCriterion("goods_status =", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotEqualTo(String value) {
            addCriterion("goods_status <>", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusGreaterThan(String value) {
            addCriterion("goods_status >", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusGreaterThanOrEqualTo(String value) {
            addCriterion("goods_status >=", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusLessThan(String value) {
            addCriterion("goods_status <", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusLessThanOrEqualTo(String value) {
            addCriterion("goods_status <=", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusLike(String value) {
            addCriterion("goods_status like", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotLike(String value) {
            addCriterion("goods_status not like", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusIn(List<String> values) {
            addCriterion("goods_status in", values, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotIn(List<String> values) {
            addCriterion("goods_status not in", values, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusBetween(String value1, String value2) {
            addCriterion("goods_status between", value1, value2, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotBetween(String value1, String value2) {
            addCriterion("goods_status not between", value1, value2, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andInventoryIsNull() {
            addCriterion("inventory is null");
            return (Criteria) this;
        }

        public Criteria andInventoryIsNotNull() {
            addCriterion("inventory is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryEqualTo(Integer value) {
            addCriterion("inventory =", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotEqualTo(Integer value) {
            addCriterion("inventory <>", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryGreaterThan(Integer value) {
            addCriterion("inventory >", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("inventory >=", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryLessThan(Integer value) {
            addCriterion("inventory <", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryLessThanOrEqualTo(Integer value) {
            addCriterion("inventory <=", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryIn(List<Integer> values) {
            addCriterion("inventory in", values, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotIn(List<Integer> values) {
            addCriterion("inventory not in", values, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryBetween(Integer value1, Integer value2) {
            addCriterion("inventory between", value1, value2, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotBetween(Integer value1, Integer value2) {
            addCriterion("inventory not between", value1, value2, "inventory");
            return (Criteria) this;
        }

        public Criteria andSoldVolumnIsNull() {
            addCriterion("sold_volumn is null");
            return (Criteria) this;
        }

        public Criteria andSoldVolumnIsNotNull() {
            addCriterion("sold_volumn is not null");
            return (Criteria) this;
        }

        public Criteria andSoldVolumnEqualTo(Integer value) {
            addCriterion("sold_volumn =", value, "soldVolumn");
            return (Criteria) this;
        }

        public Criteria andSoldVolumnNotEqualTo(Integer value) {
            addCriterion("sold_volumn <>", value, "soldVolumn");
            return (Criteria) this;
        }

        public Criteria andSoldVolumnGreaterThan(Integer value) {
            addCriterion("sold_volumn >", value, "soldVolumn");
            return (Criteria) this;
        }

        public Criteria andSoldVolumnGreaterThanOrEqualTo(Integer value) {
            addCriterion("sold_volumn >=", value, "soldVolumn");
            return (Criteria) this;
        }

        public Criteria andSoldVolumnLessThan(Integer value) {
            addCriterion("sold_volumn <", value, "soldVolumn");
            return (Criteria) this;
        }

        public Criteria andSoldVolumnLessThanOrEqualTo(Integer value) {
            addCriterion("sold_volumn <=", value, "soldVolumn");
            return (Criteria) this;
        }

        public Criteria andSoldVolumnIn(List<Integer> values) {
            addCriterion("sold_volumn in", values, "soldVolumn");
            return (Criteria) this;
        }

        public Criteria andSoldVolumnNotIn(List<Integer> values) {
            addCriterion("sold_volumn not in", values, "soldVolumn");
            return (Criteria) this;
        }

        public Criteria andSoldVolumnBetween(Integer value1, Integer value2) {
            addCriterion("sold_volumn between", value1, value2, "soldVolumn");
            return (Criteria) this;
        }

        public Criteria andSoldVolumnNotBetween(Integer value1, Integer value2) {
            addCriterion("sold_volumn not between", value1, value2, "soldVolumn");
            return (Criteria) this;
        }

        public Criteria andIsChoicenessIsNull() {
            addCriterion("is_choiceness is null");
            return (Criteria) this;
        }

        public Criteria andIsChoicenessIsNotNull() {
            addCriterion("is_choiceness is not null");
            return (Criteria) this;
        }

        public Criteria andIsChoicenessEqualTo(Boolean value) {
            addCriterion("is_choiceness =", value, "isChoiceness");
            return (Criteria) this;
        }

        public Criteria andIsChoicenessNotEqualTo(Boolean value) {
            addCriterion("is_choiceness <>", value, "isChoiceness");
            return (Criteria) this;
        }

        public Criteria andIsChoicenessGreaterThan(Boolean value) {
            addCriterion("is_choiceness >", value, "isChoiceness");
            return (Criteria) this;
        }

        public Criteria andIsChoicenessGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_choiceness >=", value, "isChoiceness");
            return (Criteria) this;
        }

        public Criteria andIsChoicenessLessThan(Boolean value) {
            addCriterion("is_choiceness <", value, "isChoiceness");
            return (Criteria) this;
        }

        public Criteria andIsChoicenessLessThanOrEqualTo(Boolean value) {
            addCriterion("is_choiceness <=", value, "isChoiceness");
            return (Criteria) this;
        }

        public Criteria andIsChoicenessIn(List<Boolean> values) {
            addCriterion("is_choiceness in", values, "isChoiceness");
            return (Criteria) this;
        }

        public Criteria andIsChoicenessNotIn(List<Boolean> values) {
            addCriterion("is_choiceness not in", values, "isChoiceness");
            return (Criteria) this;
        }

        public Criteria andIsChoicenessBetween(Boolean value1, Boolean value2) {
            addCriterion("is_choiceness between", value1, value2, "isChoiceness");
            return (Criteria) this;
        }

        public Criteria andIsChoicenessNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_choiceness not between", value1, value2, "isChoiceness");
            return (Criteria) this;
        }

        public Criteria andIsOnsaleIsNull() {
            addCriterion("is_onSale is null");
            return (Criteria) this;
        }

        public Criteria andIsOnsaleIsNotNull() {
            addCriterion("is_onSale is not null");
            return (Criteria) this;
        }

        public Criteria andIsOnsaleEqualTo(Boolean value) {
            addCriterion("is_onSale =", value, "isOnsale");
            return (Criteria) this;
        }

        public Criteria andIsOnsaleNotEqualTo(Boolean value) {
            addCriterion("is_onSale <>", value, "isOnsale");
            return (Criteria) this;
        }

        public Criteria andIsOnsaleGreaterThan(Boolean value) {
            addCriterion("is_onSale >", value, "isOnsale");
            return (Criteria) this;
        }

        public Criteria andIsOnsaleGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_onSale >=", value, "isOnsale");
            return (Criteria) this;
        }

        public Criteria andIsOnsaleLessThan(Boolean value) {
            addCriterion("is_onSale <", value, "isOnsale");
            return (Criteria) this;
        }

        public Criteria andIsOnsaleLessThanOrEqualTo(Boolean value) {
            addCriterion("is_onSale <=", value, "isOnsale");
            return (Criteria) this;
        }

        public Criteria andIsOnsaleIn(List<Boolean> values) {
            addCriterion("is_onSale in", values, "isOnsale");
            return (Criteria) this;
        }

        public Criteria andIsOnsaleNotIn(List<Boolean> values) {
            addCriterion("is_onSale not in", values, "isOnsale");
            return (Criteria) this;
        }

        public Criteria andIsOnsaleBetween(Boolean value1, Boolean value2) {
            addCriterion("is_onSale between", value1, value2, "isOnsale");
            return (Criteria) this;
        }

        public Criteria andIsOnsaleNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_onSale not between", value1, value2, "isOnsale");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIsNull() {
            addCriterion("discount_price is null");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIsNotNull() {
            addCriterion("discount_price is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceEqualTo(Double value) {
            addCriterion("discount_price =", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotEqualTo(Double value) {
            addCriterion("discount_price <>", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceGreaterThan(Double value) {
            addCriterion("discount_price >", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("discount_price >=", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceLessThan(Double value) {
            addCriterion("discount_price <", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceLessThanOrEqualTo(Double value) {
            addCriterion("discount_price <=", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIn(List<Double> values) {
            addCriterion("discount_price in", values, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotIn(List<Double> values) {
            addCriterion("discount_price not in", values, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceBetween(Double value1, Double value2) {
            addCriterion("discount_price between", value1, value2, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotBetween(Double value1, Double value2) {
            addCriterion("discount_price not between", value1, value2, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}