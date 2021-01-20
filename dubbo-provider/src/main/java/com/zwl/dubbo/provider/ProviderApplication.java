package com.zwl.dubbo.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** Created by zwl on 2020/11/22 17:41 */
@SpringBootApplication
@EnableDubbo
public class ProviderApplication {
  public static void main(String[] args) {
    SpringApplication.run(ProviderApplication.class);
  }
}
