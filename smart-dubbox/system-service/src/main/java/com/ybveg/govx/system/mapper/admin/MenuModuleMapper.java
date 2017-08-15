package com.ybveg.govx.system.mapper.admin;

import com.ybveg.govx.system.model.po.admin.MenuModule;

public interface MenuModuleMapper {

  int insert(MenuModule record);

  int insertSelective(MenuModule record);
}