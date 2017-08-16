package com.ybveg.govx.system.mapper;

import com.ybveg.govx.system.model.po.Department;

public interface DepartmentMapper {

  int insert(Department record);

  int insertSelective(Department record);
}