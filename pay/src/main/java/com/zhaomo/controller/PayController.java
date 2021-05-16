package com.zhaomo.controller;

import com.zhaomo.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Auther: zhaomo
 * @Date: 2021/05/16 21:30
 * @Description:
 */
@RestController
public class PayController {
    @Resource
    private PayService payService;

    @GetMapping("/save")
    public String save(){
        this.payService.save();
        return "success";
    }
}
