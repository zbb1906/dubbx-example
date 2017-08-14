package com.ybveg.govx.mvc.module.system;

import com.ybveg.govx.mvc.auth.ModuleType;

/**
 * 系统模块管理
 *
 * @auther zbb
 * @create 2017/8/11
 */
public class SystemMoudle implements ModuleType {

  @Override
  public String getCode() {
    return "system.admin.module";
  }

  @Override
  public String getName() {
    return "模块管理";
  }

  @Override
  public String desc() {
    return "后台管理-模块管理";
  }
}
