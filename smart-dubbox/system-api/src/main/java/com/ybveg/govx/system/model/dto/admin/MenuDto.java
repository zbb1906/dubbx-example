package com.ybveg.govx.system.model.dto.admin;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MenuDto {

  private String id;

  private String name;

  private Integer level;

  private Integer sort;

  private Date createTime;

}