package com.zwl.dubbo.provider.service.impl;

import com.zwl.api.IUserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/** Created by zwl on 2020/11/22 17:43 */
@Component
@Service(interfaceClass = IUserService.class)
public class IUserServiceImpl implements IUserService {
  @Override
  public String sayHello(String name) {

    return "hello" + name;
  }
}
