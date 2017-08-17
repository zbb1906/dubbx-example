package com.ybveg.govx.system.model.dto;

import com.github.tj123.common.BaseDto;
import com.ybveg.govx.system.model.po.Module;
import com.ybveg.govx.system.model.po.RoleModuleFunction;
import java.io.Serializable;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ModuleDto extends BaseDto<Module> implements Serializable {

  private static final long serialVersionUID = 1L;

  private String moduleCode;

  private String clazz;

  private String name;

  private Date createTime;

}