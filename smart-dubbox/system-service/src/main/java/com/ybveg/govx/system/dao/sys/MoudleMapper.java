package com.ybveg.govx.system.dao.sys;

import com.ybveg.govx.system.model.po.sys.Moudle;

public interface MoudleMapper {

  int insert(Moudle record);

  int insertSelective(Moudle record);
}