package com.ybveg.govx.module;

import com.ybveg.auth.ModuleType;

/**
 * 系统模块管理
 *
 * @auther zbb
 * @create 2017/8/11
 */
public class ModuleModule implements ModuleType {

  @Override
  public String getCode() {
    return "system.admin.module";
  }

  @Override
  public String getName() {
    return "模块管理";
  }
}
