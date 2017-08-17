package com.ybveg.govx.system.model.po;

import com.github.tj123.common.BasePo;
import com.ybveg.govx.system.model.dto.ModuleDto;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "sys_module")
public class Module extends BasePo<ModuleDto> implements Serializable {

  private static final long serialVersionUID = 1L;

  private String moduleCode;

  private String clazz;

  private String name;

  private Date createTime;

}