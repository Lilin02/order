package com.example.demo.service;

import com.example.demo.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    OrderDao orderDao;

    public String test(String name){
        return "orderService "+ orderDao.test(name);
    }
}
