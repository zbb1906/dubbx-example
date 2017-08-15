package com.ybveg.govx.system.mapper;

import com.ybveg.govx.system.model.po.UserRole;

public interface UserRoleMapper {

  int insert(UserRole record);

  int insertSelective(UserRole record);
}