package com.ybveg.govx.system.dao.sys;

import com.ybveg.govx.system.model.po.sys.Role;

public interface RoleMapper {

  int insert(Role record);

  int insertSelective(Role record);
}