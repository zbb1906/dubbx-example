package com.ybveg.govx.system.mapper.admin;

import com.ybveg.govx.system.model.po.admin.Menu;

public interface MenuMapper {

  int insert(Menu record);

  int insertSelective(Menu record);
}