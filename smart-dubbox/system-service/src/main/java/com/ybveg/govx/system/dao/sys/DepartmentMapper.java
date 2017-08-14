package com.ybveg.govx.system.dao.sys;

import com.ybveg.govx.system.model.po.sys.Department;

public interface DepartmentMapper {

  int insert(Department record);

  int insertSelective(Department record);
}