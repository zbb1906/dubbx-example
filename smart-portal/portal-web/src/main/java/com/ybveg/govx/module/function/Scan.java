package com.ybveg.govx.module.function;

import com.ybveg.govx.mvc.auth.FunctionType;

/**
 * @auther zbb
 * @create 2017/8/11
 */
public class Scan implements FunctionType {

  @Override
  public String getCode() {
    return "func.scan";
  }

  @Override
  public String getName() {
    return "扫描功能";
  }

}
