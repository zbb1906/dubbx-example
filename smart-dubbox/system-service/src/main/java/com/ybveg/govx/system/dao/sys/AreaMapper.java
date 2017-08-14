package com.ybveg.govx.system.dao.sys;

import com.ybveg.govx.system.model.po.sys.Area;

public interface AreaMapper {

  int insert(Area record);

  int insertSelective(Area record);
}