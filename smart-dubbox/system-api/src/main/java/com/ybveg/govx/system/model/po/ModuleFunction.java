package com.ybveg.govx.system.model.po;


import com.github.tj123.common.BasePo;
import com.ybveg.govx.system.model.dto.MenuModuleDto;
import com.ybveg.govx.system.model.dto.ModuleFunctionDto;
import java.io.Serializable;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ModuleFunction extends BasePo<ModuleFunctionDto> implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  private String id;

  private String moduleId;

  private String funcCode;

  private String clazz;

  private String name;

  private String alias;

}