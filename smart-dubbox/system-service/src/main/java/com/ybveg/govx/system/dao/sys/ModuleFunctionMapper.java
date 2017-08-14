package com.ybveg.govx.system.dao.sys;

import com.ybveg.govx.system.model.po.sys.ModuleFunction;

public interface ModuleFunctionMapper {

  int insert(ModuleFunction record);

  int insertSelective(ModuleFunction record);
}