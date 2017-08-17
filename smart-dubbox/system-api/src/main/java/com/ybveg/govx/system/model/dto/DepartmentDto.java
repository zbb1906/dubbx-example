package com.ybveg.govx.system.model.dto;

import com.github.tj123.common.BaseDto;
import com.ybveg.govx.system.model.po.Department;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class DepartmentDto extends BaseDto<Department>{

  private String id;

  private String deptType;

  private String deptCode;

  private String deptName;

  private String deptAdmin;

  private String areaCode;

  private String enable;

  private Date createTime;

}