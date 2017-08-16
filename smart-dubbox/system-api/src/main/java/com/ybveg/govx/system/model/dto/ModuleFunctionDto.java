package com.ybveg.govx.system.model.dto;


import com.github.tj123.common.BaseDto;
import com.ybveg.govx.system.model.po.ModuleFunction;
import com.ybveg.govx.system.model.po.RoleModuleFunction;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ModuleFunctionDto extends BaseDto<ModuleFunction> {

  private String id;

  private String moduleId;

  private String funcCode;

  private String clazz;

  private String name;

  private String alias;

}