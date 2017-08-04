package com.ybveg.govx.system.api;

import com.ybveg.govx.dto.UserDto;

/**
 * 用户
 *
 * @auther zbb
 * @create 2017/8/2
 */
public interface UserService {

  /**
   * 根据ID查找用户
   *
   * @param id 用户id
   * @return 返回用户对象UserDto
   */
  public UserDto findUser(String id);
}
