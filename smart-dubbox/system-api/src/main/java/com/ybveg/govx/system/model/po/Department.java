package com.ybveg.govx.system.model.po;

import com.github.tj123.common.BaseDto;
import com.github.tj123.common.BasePo;
import com.ybveg.govx.system.model.dto.DepartmentDto;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@Table(name = "sys_dept")
public class Department extends BasePo<DepartmentDto> {

  @Id
  private String id;

  private String deptType;

  private String deptCode;

  private String deptName;

  private String deptAdmin;

  private String areaCode;

  private String enable;

  private Date createTime;

}