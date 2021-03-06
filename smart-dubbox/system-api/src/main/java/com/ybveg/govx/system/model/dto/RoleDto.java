package com.ybveg.govx.system.model.dto;

import com.github.tj123.common.BaseDto;
import com.github.tj123.common.BasePo;
import com.ybveg.govx.system.model.po.Role;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoleDto extends BaseDto<Role> implements Serializable {

  private static final long serialVersionUID = 1L;

  private String id;

  private String type;

  private String deptId;

  private String name;

  private String createTime;

}