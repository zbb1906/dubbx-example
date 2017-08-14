package com.ybveg.govx.system.model.po.sys;

import java.util.Date;

public class Moudle {

  private String id;

  private String moudleCode;

  private String class;

  private String name;

  private Date createTime;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id == null ? null : id.trim();
  }

  public String getMoudleCode() {
    return moudleCode;
  }

  public void setMoudleCode(String moudleCode) {
    this.moudleCode = moudleCode == null ? null : moudleCode.trim();
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

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }
}