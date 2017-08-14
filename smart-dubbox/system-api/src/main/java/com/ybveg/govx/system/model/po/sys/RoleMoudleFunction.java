package com.ybveg.govx.system.model.po.sys;

public class RoleMoudleFunction {

  private String roleId;

  private String moudleFuncId;

  public String getRoleId() {
    return roleId;
  }

  public void setRoleId(String roleId) {
    this.roleId = roleId == null ? null : roleId.trim();
  }

  public String getMoudleFuncId() {
    return moudleFuncId;
  }

  public void setMoudleFuncId(String moudleFuncId) {
    this.moudleFuncId = moudleFuncId == null ? null : moudleFuncId.trim();
  }
}