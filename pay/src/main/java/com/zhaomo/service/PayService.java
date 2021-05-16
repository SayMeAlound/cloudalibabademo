package com.zhaomo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * @Auther: zhaomo
 * @Date: 2021/05/16 21:28
 * @Description:
 */
@Service
public class PayService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(){
        this.jdbcTemplate.update("insert into pay(username) values ('张三')");
    }
}
