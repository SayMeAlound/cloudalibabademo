package com.zhaomo.controller;

import com.zhaomo.service.OrderService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Auther: zhaomo
 * @Date: 2021/05/16 21:29
 * @Description:
 */
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/save")
    @GlobalTransactional
    public String save(){
        //订单
        this.orderService.save();
//        int i = 10/0;
        //支付
        this.restTemplate.getForObject("http://localhost:9999/save",String.class);
        return "success";
    }
}
