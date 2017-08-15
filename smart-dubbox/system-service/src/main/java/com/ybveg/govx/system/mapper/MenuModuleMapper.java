package com.ybveg.govx.system.mapper;

import com.ybveg.govx.system.model.po.MenuModule;

public interface MenuModuleMapper {

  int insert(MenuModule record);

  int insertSelective(MenuModule record);
}