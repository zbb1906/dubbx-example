package com.ybveg.govx.system.model.po.sys;

public class Area {

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

  public String getAreaCode() {
    return areaCode;
  }

  public void setAreaCode(String areaCode) {
    this.areaCode = areaCode == null ? null : areaCode.trim();
  }

  public String getAreaName() {
    return areaName;
  }

  public void setAreaName(String areaName) {
    this.areaName = areaName == null ? null : areaName.trim();
  }

  public Integer getCodeLevel() {
    return codeLevel;
  }

  public void setCodeLevel(Integer codeLevel) {
    this.codeLevel = codeLevel;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName == null ? null : fullName.trim();
  }

  public String getParentCode() {
    return parentCode;
  }

  public void setParentCode(String parentCode) {
    this.parentCode = parentCode == null ? null : parentCode.trim();
  }

  public String getProvinceCode() {
    return provinceCode;
  }

  public void setProvinceCode(String provinceCode) {
    this.provinceCode = provinceCode == null ? null : provinceCode.trim();
  }

  public String getCityCode() {
    return cityCode;
  }

  public void setCityCode(String cityCode) {
    this.cityCode = cityCode == null ? null : cityCode.trim();
  }

  public String getCountyCode() {
    return countyCode;
  }

  public void setCountyCode(String countyCode) {
    this.countyCode = countyCode == null ? null : countyCode.trim();
  }

  public String getTownCode() {
    return townCode;
  }

  public void setTownCode(String townCode) {
    this.townCode = townCode == null ? null : townCode.trim();
  }

  public String getVillageCode() {
    return villageCode;
  }

  public void setVillageCode(String villageCode) {
    this.villageCode = villageCode == null ? null : villageCode.trim();
  }
}