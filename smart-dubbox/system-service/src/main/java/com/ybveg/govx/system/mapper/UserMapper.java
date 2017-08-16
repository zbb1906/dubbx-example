package com.ybveg.govx.system.mapper;

import com.ybveg.govx.system.model.po.User;

public interface UserMapper {

  int insert(User record);

  int insertSelective(User record);
}