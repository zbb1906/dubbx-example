package com.ybveg.govx.system.dao.sys;

import com.ybveg.govx.system.model.po.sys.User;

public interface UserMapper {

  int insert(User record);

  int insertSelective(User record);
}