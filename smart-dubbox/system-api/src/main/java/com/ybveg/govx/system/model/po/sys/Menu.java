package com.ybveg.govx.system.model.po.sys;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Menu {

  private String id;

  private String name;

  private Integer level;

  private Integer sort;

  private Date createTime;

}