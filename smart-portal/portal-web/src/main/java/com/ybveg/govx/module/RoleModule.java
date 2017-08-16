package com.ybveg.govx.module;

import com.ybveg.auth.ModuleType;

/**
 * 系统菜单模块
 *
 * @auther zbb
 * @create 2017/8/11
 */
public class RoleModule implements ModuleType {

  @Override
  public String getCode() {
    return "system.admin.role";
  }

  @Override
  public String getName() {
    return "角色管理";
  }

}
