package com.example.demo.controller;

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

    @RequestMapping("/test")
    public String test(String name){
        return name+"调用订单服务";
    }

}
