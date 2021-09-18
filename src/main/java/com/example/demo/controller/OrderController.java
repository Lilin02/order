package com.example.demo.controller;

import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：lin
 * @date ：Created in 2021/09/15 16:00
 * @description：
 * @modified By：
 * @version:
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping("/test")
    public String test(String name){
        return orderService.test(name)+"调用订单服务";
    }

}
