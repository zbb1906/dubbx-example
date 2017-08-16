package com.ybveg.govx.system.model.dto;


import com.github.tj123.common.BaseDto;
import com.ybveg.govx.system.model.po.MenuModule;
import com.ybveg.govx.system.model.po.RoleModuleFunction;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MenuModuleDto extends BaseDto<MenuModule> {

  private String menuId;

  private String moduleId;

}