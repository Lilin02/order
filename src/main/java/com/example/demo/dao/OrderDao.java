package com.example.demo.dao;

import org.springframework.stereotype.Component;

/**
 * @author ：lin
 * @date ：Created in 2021/09/17 16:47
 * @description：
 * @modified By：
 * @version:
 */
@Component
public class OrderDao {

    public String test(String name){
        return "orderDao "+name;
    }
}
