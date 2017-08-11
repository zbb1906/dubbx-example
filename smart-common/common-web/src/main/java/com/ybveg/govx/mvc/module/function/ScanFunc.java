package com.ybveg.govx.mvc.module.function;

import com.ybveg.govx.mvc.auth.FuncType;

/**
 * @auther zbb
 * @create 2017/8/11
 */
public class ScanFunc implements FuncType {

  @Override
  public String getCode() {
    return "func.scan";
  }

  @Override
  public String getName() {
    return "扫描";
  }

  @Override
  public String desc() {
    return "模块管理 扫描功能";
  }
}
