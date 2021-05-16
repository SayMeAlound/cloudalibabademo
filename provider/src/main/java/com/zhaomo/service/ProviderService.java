package com.zhaomo.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

/**
 * @Auther: zhaomo
 * @Date: 2020/11/09 23:37
 * @Description:
 */
@Service
public class ProviderService {

    @SentinelResource("test")
    public void test(){
        System.out.println("test");
    }

}
