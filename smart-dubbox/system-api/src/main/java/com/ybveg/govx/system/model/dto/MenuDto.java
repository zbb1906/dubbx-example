package com.ybveg.govx.system.model.dto;

import com.github.tj123.common.BaseDto;
import com.ybveg.govx.system.model.po.Menu;
import com.ybveg.govx.system.model.po.RoleModuleFunction;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MenuDto extends BaseDto<Menu> {

  private String id;

  private String name;

  private Integer level;

  private Integer sort;

  private Date createTime;

}