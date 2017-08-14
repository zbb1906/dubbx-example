package com.ybveg.govx.system.dao.sys;

import com.ybveg.govx.system.model.po.sys.MenuModule;

public interface MenuModuleMapper {

  int insert(MenuModule record);

  int insertSelective(MenuModule record);
}