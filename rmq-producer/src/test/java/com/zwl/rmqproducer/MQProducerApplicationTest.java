package com.zwl.rmqproducer;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/** Created by zwl on 2020/11/22 15:34 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {MQProducerApplication.class})
@Slf4j
public class MQProducerApplicationTest {

  @Autowired private RocketMQTemplate rocketMQTemplate;

  @Test
  public void test() {
    rocketMQTemplate.convertAndSend("spring-rocketmq", "hello springboot rocketmq");
    log.info("消费者发送成功");
  }
}
