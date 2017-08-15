package com.ybveg.govx.system.model.po.admin;

public class UserRole {

  private String sysUserRole;

  private String userId;

  public String getSysUserRole() {
    return sysUserRole;
  }

  public void setSysUserRole(String sysUserRole) {
    this.sysUserRole = sysUserRole == null ? null : sysUserRole.trim();
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId == null ? null : userId.trim();
  }
}