package com.ybveg.govx.system.mapper.admin;

import com.ybveg.govx.system.model.po.admin.RoleModuleFunction;

public interface RoleModuleFunctionMapper {

  int insert(RoleModuleFunction record);

  int insertSelective(RoleModuleFunction record);
}