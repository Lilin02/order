package com.example.demo.service;

import org.springframework.stereotype.Service;

/**
 * @author ：lin
 * @date ：Created in 2021/09/17 16:28
 * @description：
 * @modified By：
 * @version:
 */
@Service
public class OrderService {

    public String test(String name){
        return "orderService "+name;
    }
}
