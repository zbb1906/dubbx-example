package com.ybveg.govx.system.mapper.admin;

import com.ybveg.govx.system.model.po.admin.User;

public interface UserMapper {

  int insert(User record);

  int insertSelective(User record);
}