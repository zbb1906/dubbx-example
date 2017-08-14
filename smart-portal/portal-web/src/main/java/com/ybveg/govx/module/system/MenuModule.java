package com.ybveg.govx.module.system;

import com.ybveg.govx.mvc.auth.ModuleType;

/**
 * 系统菜单模块
 *
 * @auther zbb
 * @create 2017/8/11
 */
public class MenuModule implements ModuleType {

  @Override
  public String getCode() {
    return "system.admin.menu";
  }

  @Override
  public String getName() {
    return "菜单管理";
  }

}
