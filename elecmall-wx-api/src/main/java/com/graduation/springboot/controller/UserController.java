package com.graduation.springboot.controller;

import com.graduation.springboot.bean.*;
import com.graduation.springboot.mapper.CouponUserMapper;
import com.graduation.springboot.mapper.OrderGoodsMapper;
import com.graduation.springboot.mapper.OrderUserMapper;
import com.graduation.springboot.mapper.UserMapper;
import com.graduation.springboot.utils.AesCbcUtil;
import com.graduation.springboot.utils.HttpRequest;
import com.graduation.springboot.utils.RespUtil;

import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
public class UserController {
    @Autowired
    UserMapper userMapper;
    @Autowired
    CouponUserMapper couponUserMapper;
    @Autowired
    OrderUserMapper orderUserMapper;
    @Autowired
    OrderGoodsMapper orderGoodsMapper;

    private OrderUser ou;
    private List<OrderGoods> ogl;

//废弃登录代码
    @RequestMapping(value = "/decodeUserInfo",method = RequestMethod.POST)
    public RespEntity decodeUserInfo(@RequestBody String encryptedData, @RequestBody String iv,@RequestBody String code){
        Map map = new HashMap();
        if(code==null || code.length()==0){
            return RespUtil.error(0,"login状态code 不能为空");
        }
        //小程序唯一标识   (在微信小程序管理后台获取)
        String wxspAppid = "wxbf12cab6563eb5e2";
        //小程序的 app secret (在微信小程序管理后台获取)
        String wxspSecret = "7ef305803ff6322c39493e7e0429933a";
        //授权（微信定死的）
        String grant_type = " authorization_code";


        //////////////// 1、向微信服务器 使用登录凭证 code 获取 session_key 和 openid ////////////////
        //请求参数
        String params = "appid=" + wxspAppid + "&secret=" + wxspSecret + "&js_code=" + code + "&grant_type=" + grant_type;
        //发送请求
        String sr = HttpRequest.sendGet("https://api.weixin.qq.com/sns/jscode2session", params);
        //解析相应内容（转换成json对象）
        JSONObject json = JSONObject.fromObject(sr);
        //获取会话密钥（session_key）
        String session_key = json.get("session_key").toString();
        //用户的唯一标识（openid）
        String openid = (String) json.get("openid");

        //////////////// 2、对encryptedData加密数据进行AES解密 ////////////////
        try {
            String result = AesCbcUtil.decrypt(encryptedData, session_key, iv, "UTF-8");
            if (null != result && result.length() > 0) {
//                map.put("status", 1);
//                map.put("msg", "解密成功");

                JSONObject userInfoJSON = JSONObject.fromObject(result);
//                User user=new User();
//
//                Date time = new Date(System.currentTimeMillis());
//                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//                String current = sdf.format(time);
//                //将时间格式转换成符合Timestamp要求的格式.
//                Timestamp date =  java.sql.Timestamp.valueOf(current);
//                user.setAddTime(date);
//                user.setLoginTime(date);
//                user.setOpenid(openid);
//                user.setNickname((String)userInfoJSON.get("nickName"));
//                user.setAvatarurl((String)userInfoJSON.get("avatarUrl"));
//                user.setGender((Integer)userInfoJSON.get("gender"));
//                user.setSessionKey(session_key);
//                int data=userMapper.insertUser(user);
//                Map userInfo = new HashMap();
//                userInfo.put("openId", userInfoJSON.get("openId"));
//                userInfo.put("nickName", userInfoJSON.get("nickName"));
//                userInfo.put("gender", userInfoJSON.get("gender"));
//                userInfo.put("city", userInfoJSON.get("city"));
//                userInfo.put("province", userInfoJSON.get("province"));
//                userInfo.put("country", userInfoJSON.get("country"));
//                userInfo.put("avatarUrl", userInfoJSON.get("avatarUrl"));
//                userInfo.put("unionId", userInfoJSON.get("unionId"));
//                map.put("userInfo", userInfo);
//                return map;
//                return RespUtil.success(data,"获取用户信息并插入成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

                return  RespUtil.error(0,"解密出错！");
    }

    //用户登录
    @RequestMapping(value = "/insertUser",method = RequestMethod.POST)
    public RespEntity insertUser(@RequestBody User userInfo){
        System.out.println(userInfo.getOpenid());
        User user=userMapper.getUserByOpenid(userInfo.getOpenid());
        if(user!=null){
            return RespUtil.success(1,"用户已存在！");
        }else {
            Date time = new Date(System.currentTimeMillis());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String current = sdf.format(time);
            //将时间格式转换成符合Timestamp要求的格式.
            Timestamp date =  java.sql.Timestamp.valueOf(current);
            System.out.println("date"+date);
            userInfo.setAddTime(date);
            userInfo.setLoginTime(date);

            int data=userMapper.insertUser(userInfo);
            if(data>0){
                return RespUtil.success(userInfo.getId(),"插入 用户信息成功！");
            }else{
                return RespUtil.error(0,"插入用户信息失败！");
            }
        }


    }

    //用户优惠券
    @GetMapping("/getCouponUser")
    public RespEntity getCouponUser(@RequestParam String openid){
        List<CouponUser> data=couponUserMapper.getCouponUser(openid);
        if(!data.isEmpty()){
            return RespUtil.success(data,"获取用户优惠券成功!");
        }else{
            return  RespUtil.error(0,"获取用户优惠券失败!");
        }
    }

    //插入订单
    @Transactional
    @GetMapping("/insertOrder")
    public RespEntity insertOrder(){
        //插入订单
        int res=orderUserMapper.insertOrderUser(this.ou);
        //插入流水
        boolean flag=true;
        for(OrderGoods orderGoods  : this.ogl) {
            int data=orderGoodsMapper.insertOrderGoods(orderGoods);
            if(data<0){
                flag=false;
                break;
            }
        }

        if(res>0 && flag){
            return RespUtil.success(1,"插入订单成功！");
        }else{
            return RespUtil.error(0,"插入订单失败！");
        }
    }


    //获取订单信息
    @PostMapping("/insertOrderUser")
    public RespEntity insertOrderUser(@RequestBody OrderUser orderUser){
        this.ou=orderUser;
        if(orderUser!=null){
            return RespUtil.success(1,"获取新生成的订单信息成功!");
        }else{
            return RespUtil.error(0,"获取新生成的订单信息失败!");
        }

    }


    //获取流水信息
    @Transactional
    @PostMapping("/insertOrderGoods")
    public  RespEntity insertOrderGoods(@RequestBody List<OrderGoods> list){
        this.ogl=list;
       if(list.isEmpty()){
           return RespUtil.error(0,"获取新生成的流水信息失败!");
       }else{
           return RespUtil.success(1,"获取新生成的流水信息成功!");
       }

    }


    //根据订单ID查询流水
    @GetMapping("/getOrderGoods")
    public  RespEntity getOrderGoods(@RequestParam String orderId){
        List<OrderGoods> data=orderGoodsMapper.getOrderGoods(orderId);
        if(!data.isEmpty()){
            return RespUtil.success(data,"查询流水成功！");
        }else{
            return RespUtil.error(0,"查询流水失败！");
        }
    }

    //根据订单ID查询订单
    @GetMapping("/getOrderUser")
    public RespEntity getOrderUser(@RequestParam String oid){
        OrderUser data=orderUserMapper.getOrderUser(oid);
        if(data!=null){
            return RespUtil.success(data,"查询订单成功！");
        }else {
            return RespUtil.error(0,"查询订单失败！");
        }
    }

    //根据用户ID和筛选条件查询订单列表
    @GetMapping("/getOrderList")
    public RespEntity getOrderList(@RequestParam String openid,@RequestParam String status){
        Map<Integer,Map<String,Object>> map;
        if(status.equals("全部")){
           map=orderUserMapper.getOrderAllList(openid);
        }else{
            map=orderUserMapper.getOrderList(openid,status);
        }


        for (Map.Entry<Integer,Map<String,Object>> entry : map.entrySet()) {
            List<Map<String,Object>> data=new ArrayList<>();
            Map<Integer,Map<String,Object>> map2=orderUserMapper.getOrderGoodsList(entry.getKey());
            for (Map.Entry<Integer,Map<String,Object>> entry2 : map2.entrySet()) {
                data.add(entry2.getValue());
            }
            entry.getValue().put("subgoods",data);
        }

        List<Map<String,Object>> data2=new ArrayList<>();
        for (Map.Entry<Integer,Map<String,Object>> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            data2.add(entry.getValue());
        }
        if(data2.size()>0){
            return RespUtil.success(data2,"获取订单列表成!");
        }else{
            return  RespUtil.error(0,"获取订单列表失败，暂无数据！");
        }
    }

    //校验优惠券是否已领取过
    @GetMapping("/checkCoupon")
    public RespEntity checkCoupon(@RequestParam String openid,@RequestParam String couponId){
        CouponUser couponUser=couponUserMapper.checkCoupon(openid,couponId);
        if(couponUser!=null){
            return RespUtil.success(1,"您已领取过该优惠券！");
        }else{
            return RespUtil.error(0,"您未领取过！");
        }
    }

    //领取优惠券
    @PostMapping("/getCoupon")
    public RespEntity getCoupon(@RequestBody CouponUser couponUser){
        int data=couponUserMapper.insertCoupon(couponUser);
        if(data>0){
            return RespUtil.success(data,"领取优惠券成功！");
        }else{
            return RespUtil.error(0,"领取优惠券失败！");
        }
    }


}
