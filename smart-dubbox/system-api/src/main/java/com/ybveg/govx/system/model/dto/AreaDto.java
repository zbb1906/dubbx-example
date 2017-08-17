package com.ybveg.govx.system.model.dto;

import com.github.tj123.common.BaseDto;
import com.ybveg.govx.system.model.po.Area;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AreaDto extends BaseDto<Area> {

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