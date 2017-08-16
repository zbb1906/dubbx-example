package com.ybveg.govx.system.model.po;

import com.github.tj123.common.BasePo;
import com.ybveg.govx.system.model.dto.RoleDto;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "sys_role")
public class Role extends BasePo<RoleDto> implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  private String id;

  private String type;

  private String deptId;

  private String name;

  private Date createTime;

}