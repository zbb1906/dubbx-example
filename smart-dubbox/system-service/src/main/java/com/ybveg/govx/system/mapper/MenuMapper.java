package com.ybveg.govx.system.mapper;

import com.ybveg.govx.system.model.po.Menu;

public interface MenuMapper {

  int insert(Menu record);

  int insertSelective(Menu record);
}