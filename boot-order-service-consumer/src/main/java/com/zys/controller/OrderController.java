package com.zys.controller;

import com.zys.bean.UserAddress;
import com.zys.service.OrderService;
import com.zys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @author zhangys
 * @description
 * @date 2020/3/31
 */
@Controller
public class OrderController {

    @Autowired
    OrderService orderService;

    @ResponseBody
    @RequestMapping(value = "initOrder")
    public List<UserAddress> initOrder(@RequestParam("uid") Integer userId){
        return orderService.initOrder(userId);
    }

    @ResponseBody
    @RequestMapping(value = "test")
    public String test(String string){
        return string;
    }
}
