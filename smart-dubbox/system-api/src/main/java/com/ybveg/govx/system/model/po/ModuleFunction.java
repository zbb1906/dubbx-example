package com.ybveg.govx.system.model.po;


import com.github.tj123.common.BasePo;
import com.ybveg.govx.system.model.dto.ModuleFunctionDto;
import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "sys_module_func")
public class ModuleFunction extends BasePo<ModuleFunctionDto> implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(generator = "UUID")
  private String id;

  private String moduleCode;

  private String funcCode;

  private String clazz;

  private String name;

  private String alias;

}