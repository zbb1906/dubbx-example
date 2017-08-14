package com.ybveg.govx.system.model.po.sys;

public class RoleMoudleFunction {

  private String roleId;

  private String moduleFuncId;

  public String getRoleId() {
    return roleId;
  }

  public void setRoleId(String roleId) {
    this.roleId = roleId == null ? null : roleId.trim();
  }

  public String getModuleFuncId() {
    return moduleFuncId;
  }

  public void setModuleFuncId(String moduleFuncId) {
    this.moduleFuncId = moduleFuncId == null ? null : moduleFuncId.trim();
  }
}