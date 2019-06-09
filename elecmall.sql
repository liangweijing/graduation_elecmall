/*
Navicat MySQL Data Transfer

Source Server         : mywork
Source Server Version : 50553
Source Host           : 127.0.0.1:3306
Source Database       : elecmall

Target Server Type    : MYSQL
Target Server Version : 50553
File Encoding         : 65001

Date: 2019-06-07 11:05:23
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for address
-- ----------------------------
DROP TABLE IF EXISTS `address`;
CREATE TABLE `address` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `openid` varchar(63) NOT NULL,
  `consignee` varchar(20) NOT NULL,
  `address` varchar(20) NOT NULL,
  `detail` varchar(63) NOT NULL,
  `is_default` int(2) DEFAULT NULL,
  `mobile` varchar(20) NOT NULL,
  `add_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `username` varchar(63) NOT NULL,
  `password` varchar(63) NOT NULL,
  `avatarUrl` varchar(255) NOT NULL,
  `role` varchar(63) NOT NULL,
  `add_time` datetime DEFAULT NULL,
  `login_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `name` char(6) NOT NULL,
  `brand` varchar(12) NOT NULL,
  `banner` varchar(255) NOT NULL COMMENT '分类时代表不同商品每个品牌图',
  `list_url` varchar(255) NOT NULL,
  `add_time` datetime NOT NULL,
  `update_time` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for coupon
-- ----------------------------
DROP TABLE IF EXISTS `coupon`;
CREATE TABLE `coupon` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(20) NOT NULL COMMENT '1.新用户优惠券2.满减优惠券',
  `desc` varchar(20) NOT NULL,
  `limit` smallint(6) NOT NULL DEFAULT '1' COMMENT '限制可领数量',
  `low` int(8) NOT NULL COMMENT '减多少',
  `high` int(8) DEFAULT NULL COMMENT '满多少减，新人券可不填',
  `inventory` int(8) NOT NULL,
  `indate` int(8) DEFAULT NULL COMMENT '新人券有效天数',
  `deadline` datetime DEFAULT NULL COMMENT '满减券截止日期',
  `add_time` datetime NOT NULL,
  `update_time` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for coupon_user
-- ----------------------------
DROP TABLE IF EXISTS `coupon_user`;
CREATE TABLE `coupon_user` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `openid` varchar(63) NOT NULL,
  `coupon_id` int(8) NOT NULL,
  `status` varchar(20) NOT NULL COMMENT '已使用未使用过期',
  `desc` varchar(60) NOT NULL,
  `discount` int(8) NOT NULL,
  `num` smallint(6) NOT NULL COMMENT '已获取数量0/1',
  `order_id` int(8) DEFAULT NULL COMMENT '使用的对于订单号',
  `add_time` datetime DEFAULT NULL,
  `used_time` datetime DEFAULT NULL,
  `expire_time` datetime DEFAULT NULL COMMENT '失效日期，新人券显示领取时间加上有效天数后日期，满减券对于券表deadline',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `department_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `lastName` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `gender` int(2) DEFAULT NULL,
  `d_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `sku_id` char(4) NOT NULL COMMENT '商品详细分类区别ID',
  `title` varchar(100) DEFAULT NULL COMMENT '长标题',
  `sell_point` varchar(50) DEFAULT NULL COMMENT '一句话卖点',
  `goods_name` char(6) NOT NULL COMMENT '和目录表对应',
  `category_id` int(4) DEFAULT NULL,
  `cover_url` varchar(255) DEFAULT NULL,
  `list_url` varchar(255) DEFAULT NULL,
  `picSet_id` int(4) DEFAULT NULL COMMENT '图集',
  `brand` varchar(12) NOT NULL COMMENT '和分类表对应',
  `attr_size` varchar(20) DEFAULT NULL,
  `attr_type` varchar(20) NOT NULL COMMENT '型号',
  `attr_color` varchar(20) DEFAULT NULL,
  `attr_texture` varchar(50) DEFAULT NULL COMMENT '材质',
  `price` decimal(10,2) unsigned zerofill NOT NULL,
  `goods_status` varchar(20) NOT NULL COMMENT '上架，下架，缺货',
  `inventory` int(8) NOT NULL COMMENT '存货',
  `sold_volumn` int(8) NOT NULL DEFAULT '10' COMMENT '已售（销量）',
  `is_choiceness` tinyint(1) DEFAULT NULL COMMENT '是否精选',
  `is_onSale` tinyint(1) DEFAULT NULL COMMENT '是否特卖',
  `discount_price` decimal(10,2) unsigned zerofill DEFAULT NULL COMMENT '特卖价格',
  `detail` text COMMENT '商品详情html',
  `add_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`sku_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



-- ----------------------------
-- Table structure for order_goods
-- ----------------------------
DROP TABLE IF EXISTS `order_goods`;
CREATE TABLE `order_goods` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `order_id` int(8) NOT NULL,
  `sku_id` int(8) NOT NULL,
  `goods_name` varchar(20) NOT NULL,
  `list_url` varchar(255) NOT NULL,
  `number` int(8) NOT NULL,
  `total_price` decimal(10,2) NOT NULL,
  `price` decimal(10,2) NOT NULL,
  `add_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for order_user
-- ----------------------------
DROP TABLE IF EXISTS `order_user`;
CREATE TABLE `order_user` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `openid` varchar(63) NOT NULL,
  `status` varchar(63) NOT NULL,
  `address_id` int(8) NOT NULL,
  `total_price` decimal(10,2) NOT NULL,
  `feight_fee` decimal(10,2) NOT NULL DEFAULT '10.00',
  `coupon_price` decimal(10,2) DEFAULT NULL,
  `expire_time` time DEFAULT NULL,
  `pay_time` datetime DEFAULT NULL,
  `ship_info` varchar(63) DEFAULT NULL,
  `ship_channel` varchar(63) DEFAULT NULL,
  `confirm_time` datetime DEFAULT NULL,
  `add_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for pic_set
-- ----------------------------
DROP TABLE IF EXISTS `pic_set`;
CREATE TABLE `pic_set` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `swiper1` varchar(255) NOT NULL,
  `swiper2` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `nickname` varchar(63) NOT NULL,
  `gender` tinyint(3) NOT NULL,
  `avatarUrl` varchar(255) NOT NULL,
  `mobile` varchar(20) DEFAULT NULL,
  `openid` varchar(63) DEFAULT NULL,
  `session_key` varchar(100) DEFAULT NULL,
  `add_time` datetime DEFAULT NULL,
  `login_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;
