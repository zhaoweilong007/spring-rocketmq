package com.zwl.rmqconsumer.listener;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

/** Created by zwl on 2020/11/22 15:37 */
@Component
@RocketMQMessageListener(topic = "spring-rocketmq", consumerGroup = "${rocketmq.consumer.group}")
@Slf4j
public class ConsumerListener implements RocketMQListener<String> {

  @Override
  public void onMessage(String s) {
    log.info("receive message:" + s);
  }
}
