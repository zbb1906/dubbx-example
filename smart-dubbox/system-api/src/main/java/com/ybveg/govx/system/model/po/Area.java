package com.ybveg.govx.system.model.po;

import com.github.tj123.common.BasePo;
import com.ybveg.govx.system.model.dto.AreaDto;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Table(name = "sys_area")
public class Area extends BasePo<AreaDto> {

  @Id
  private String areaCode;

  private String areaName;

  private Integer codeLevel;

  private String fullName;

  private String parentCode;

  private String provinceCode;

  private String cityCode;

  private String countyCode;

  private String townCode;

  private String villageCode;

}