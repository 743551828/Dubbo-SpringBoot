package com.zys.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zys.bean.UserAddress;
import com.zys.service.OrderService;
import com.zys.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description 订单接口的实现类
 * @author zhangys
 * @date 2020/3/30
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Reference
    UserService userService;

    /**
     * @description 1.查询用户的收货地址
     * @params userId
     * @return null
     * @author zhangys
     * @date 2020/3/30
     */
    @Override
    public List<UserAddress> initOrder(Integer userId) {
        return userService.getUserAddressList(userId);

    }
}
