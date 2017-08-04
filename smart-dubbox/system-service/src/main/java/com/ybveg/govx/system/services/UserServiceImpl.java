package com.ybveg.govx.system.services;

import com.alibaba.dubbo.config.annotation.Service;
import com.ybveg.govx.dto.UserDto;
import com.ybveg.govx.system.api.UserService;
import java.util.UUID;

/**
 * 用户实现类
 *
 * @auther zbb
 * @create 2017/8/2
 */
@Service(interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {

  @Override
  public UserDto findUser(String id) {
    UserDto user = new UserDto();
    user.setId(id);
    user.setDeptId(UUID.randomUUID().toString().replaceAll("-", ""));
    user.setDataCode("510000");
    user.setUsername("yuanben");
    return user;
  }
}
