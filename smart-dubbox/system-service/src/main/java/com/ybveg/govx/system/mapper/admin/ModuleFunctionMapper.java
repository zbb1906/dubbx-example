package com.ybveg.govx.system.mapper.admin;

import com.ybveg.govx.system.model.po.admin.ModuleFunction;

public interface ModuleFunctionMapper {

  int insert(ModuleFunction record);

  int insertSelective(ModuleFunction record);
}