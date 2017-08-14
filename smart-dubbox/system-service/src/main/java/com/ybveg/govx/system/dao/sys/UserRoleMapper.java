package com.ybveg.govx.system.dao.sys;

import com.ybveg.govx.system.model.po.sys.UserRole;

public interface UserRoleMapper {

  int insert(UserRole record);

  int insertSelective(UserRole record);
}