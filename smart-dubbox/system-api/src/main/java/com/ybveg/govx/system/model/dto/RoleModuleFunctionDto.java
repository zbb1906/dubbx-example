package com.ybveg.govx.system.model.dto;

import com.github.tj123.common.BaseDto;
import com.ybveg.govx.system.model.po.RoleModuleFunction;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoleModuleFunctionDto extends BaseDto<RoleModuleFunction> implements Serializable {

  private static final long serialVersionUID = 1L;

  private String roleId;

  private String moduleFuncId;

}