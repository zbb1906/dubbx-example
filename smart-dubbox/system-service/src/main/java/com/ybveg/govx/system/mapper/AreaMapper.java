package com.ybveg.govx.system.mapper;

import com.ybveg.govx.system.model.po.Area;

public interface AreaMapper {

  int insert(Area record);

  int insertSelective(Area record);
}