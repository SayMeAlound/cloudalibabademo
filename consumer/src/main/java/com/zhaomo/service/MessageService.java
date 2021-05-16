package com.zhaomo.service;

import com.zhaomo.entity.Order;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

/**
 * @Auther: zhaomo
 * @Date: 2021/05/09 20:21
 * @Description:
 */
@Slf4j
@Service
@RocketMQMessageListener(consumerGroup = "myConsumer",topic = "orderTopic")
public class MessageService implements RocketMQListener<Order> {
    @Override
    public void onMessage(Order order) {
        log.info("新订单{},发短信",order);
    }
}