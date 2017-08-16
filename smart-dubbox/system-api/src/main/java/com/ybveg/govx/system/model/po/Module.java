package com.ybveg.govx.system.model.po;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Module {

  private String id;

  private String moduleCode;

  private String clazz;

  private String name;

  private Date createTime;

}