package com.ybveg.govx.system.mapper;

import com.ybveg.govx.system.model.po.ModuleFunction;

public interface ModuleFunctionMapper {

  int insert(ModuleFunction record);

  int insertSelective(ModuleFunction record);
}