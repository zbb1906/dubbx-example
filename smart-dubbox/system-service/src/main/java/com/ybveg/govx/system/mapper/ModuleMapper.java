package com.ybveg.govx.system.mapper;

import com.ybveg.govx.system.model.po.Module;

public interface ModuleMapper {

  int insert(Module record);

  int insertSelective(Module record);
}