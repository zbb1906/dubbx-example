package com.ybveg.govx.system.model.po;

import com.github.tj123.common.BasePo;
import com.ybveg.govx.system.model.dto.MenuModuleDto;
import com.ybveg.govx.system.model.dto.ModuleDto;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Module extends BasePo<ModuleDto> implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  private String id;

  private String moduleCode;

  private String clazz;

  private String name;

  private Date createTime;

}