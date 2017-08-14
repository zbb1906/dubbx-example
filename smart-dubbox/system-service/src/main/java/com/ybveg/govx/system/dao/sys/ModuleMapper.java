package com.ybveg.govx.system.dao.sys;

import com.ybveg.govx.system.model.po.sys.Module;

public interface ModuleMapper {

  int insert(Module record);

  int insertSelective(Module record);
}