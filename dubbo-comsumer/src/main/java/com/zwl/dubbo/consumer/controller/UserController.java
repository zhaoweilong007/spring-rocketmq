package com.zwl.dubbo.consumer.controller;

import com.zwl.api.IUserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** Created by zwl on 2020/11/22 19:09 */
@RestController
@RequestMapping("/user")
public class UserController {

  @Reference private IUserService iUserService;

  @GetMapping("/sayHello")
  public String sayHello(String name) {
    return iUserService.sayHello(name);
  }
}
