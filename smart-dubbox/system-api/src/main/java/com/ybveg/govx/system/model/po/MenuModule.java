package com.ybveg.govx.system.model.po;


import com.github.tj123.common.BasePo;
import com.ybveg.govx.system.model.dto.MenuDto;
import com.ybveg.govx.system.model.dto.MenuModuleDto;
import java.io.Serializable;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MenuModule extends BasePo<MenuModuleDto> implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  private String menuId;

  private String moduleCode;

}