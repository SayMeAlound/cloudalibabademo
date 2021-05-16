package com.zhaomo.test;

import org.springframework.web.client.RestTemplate;

/**
 * @Auther: zhaomo
 * @Date: 2020/11/09 23:25
 * @Description:
 */
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;

public class Test {
    public static void main(String[] args) throws Exception {
        //创建消息生产者
        DefaultMQProducer producer = new DefaultMQProducer("myproducer-group");
        //设置NameServer
        producer.setNamesrvAddr("39.96.18.196:9876");
        //启动生产者
        producer.start();
        //构建消息对象
        Message message = new Message("myTopic","myTag",("Test MQ").getBytes());
        //发送消息
        SendResult result = producer.send(message, 10000);
        System.out.println(result);
        //关闭生产者
        producer.shutdown();
    }
}
