package com.ybveg.govx.system.model.po.admin;

import java.util.Date;

public class Department {

  private String id;

  private String deptType;

  private String deptCode;

  private String deptName;

  private String deptAdmin;

  private String areaCode;

  private String enable;

  private Date createTime;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id == null ? null : id.trim();
  }

  public String getDeptType() {
    return deptType;
  }

  public void setDeptType(String deptType) {
    this.deptType = deptType == null ? null : deptType.trim();
  }

  public String getDeptCode() {
    return deptCode;
  }

  public void setDeptCode(String deptCode) {
    this.deptCode = deptCode == null ? null : deptCode.trim();
  }

  public String getDeptName() {
    return deptName;
  }

  public void setDeptName(String deptName) {
    this.deptName = deptName == null ? null : deptName.trim();
  }

  public String getDeptAdmin() {
    return deptAdmin;
  }

  public void setDeptAdmin(String deptAdmin) {
    this.deptAdmin = deptAdmin == null ? null : deptAdmin.trim();
  }

  public String getAreaCode() {
    return areaCode;
  }

  public void setAreaCode(String areaCode) {
    this.areaCode = areaCode == null ? null : areaCode.trim();
  }

  public String getEnable() {
    return enable;
  }

  public void setEnable(String enable) {
    this.enable = enable == null ? null : enable.trim();
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }
}