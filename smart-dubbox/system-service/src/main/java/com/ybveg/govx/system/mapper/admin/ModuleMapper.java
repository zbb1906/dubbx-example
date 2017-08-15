package com.ybveg.govx.system.mapper.admin;

import com.ybveg.govx.system.model.po.admin.Module;

public interface ModuleMapper {

  int insert(Module record);

  int insertSelective(Module record);
}