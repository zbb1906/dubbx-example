package com.ybveg.govx.system.model.po.sys;

public class ModuleFunction {

  private String id;

  private String moudleId;

  private String funcCode;

  private String class;

  private String name;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id == null ? null : id.trim();
  }

  public String getMoudleId() {
    return moudleId;
  }

  public void setMoudleId(String moudleId) {
    this.moudleId = moudleId == null ? null : moudleId.trim();
  }

  public String getFuncCode() {
    return funcCode;
  }

  public void setFuncCode(String funcCode) {
    this.funcCode = funcCode == null ? null : funcCode.trim();
  }

  public String getClass() {
    return class ;
  }

  public void setClass(String class) {
    this. class =class ==null ? null : class.trim();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name == null ? null : name.trim();
  }
}