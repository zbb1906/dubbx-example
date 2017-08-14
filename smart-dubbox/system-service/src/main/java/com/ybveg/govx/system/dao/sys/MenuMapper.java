package com.ybveg.govx.system.dao.sys;

import com.ybveg.govx.system.model.po.sys.Menu;

public interface MenuMapper {

  int insert(Menu record);

  int insertSelective(Menu record);
}