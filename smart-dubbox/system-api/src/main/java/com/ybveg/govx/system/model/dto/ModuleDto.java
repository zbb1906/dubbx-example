package com.ybveg.govx.system.model.dto;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ModuleDto {

  private String id;

  private String moduleCode;

  private String clazz;

  private String name;

  private Date createTime;

}