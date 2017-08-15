package com.ybveg.govx.system.mapper.admin;

import com.ybveg.govx.system.model.po.admin.UserRole;

public interface UserRoleMapper {

  int insert(UserRole record);

  int insertSelective(UserRole record);
}