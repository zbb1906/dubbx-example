package com.ybveg.govx.system.mapper.admin;

import com.ybveg.govx.system.model.po.admin.Department;

public interface DepartmentMapper {

  int insert(Department record);

  int insertSelective(Department record);
}