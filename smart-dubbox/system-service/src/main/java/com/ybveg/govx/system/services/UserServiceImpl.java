package com.ybveg.govx.system.services;

import com.alibaba.dubbo.config.annotation.Service;
import com.ybveg.govx.system.api.UserService;
import com.ybveg.govx.system.dao.UserMapper;
import com.ybveg.govx.system.model.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 用户实现类
 *
 * @auther zbb
 * @create 2017/8/2
 */
@Service(interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {


  @Autowired
  private UserMapper mapper;

  @Override
  public UserDto findUser(String id) {
    return new UserDto();
  }
}
