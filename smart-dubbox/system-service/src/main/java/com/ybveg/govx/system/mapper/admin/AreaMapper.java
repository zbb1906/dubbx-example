package com.ybveg.govx.system.mapper.admin;

import com.ybveg.govx.system.model.po.admin.Area;

public interface AreaMapper {

  int insert(Area record);

  int insertSelective(Area record);
}