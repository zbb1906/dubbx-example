package com.ybveg.govx.system.model.po;

import com.github.tj123.common.BasePo;
import com.ybveg.govx.system.model.dto.MenuModuleDto;
import com.ybveg.govx.system.model.dto.RoleModuleFunctionDto;
import java.io.Serializable;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoleModuleFunction extends BasePo<RoleModuleFunctionDto> implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  private String roleId;

  private String moduleFuncId;

}