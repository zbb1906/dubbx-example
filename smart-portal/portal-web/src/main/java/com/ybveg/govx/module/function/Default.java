package com.ybveg.govx.module.function;

import com.ybveg.govx.mvc.auth.FunctionType;

/**
 * 每个模块都有一个默认功能
 *
 * @auther zbb
 * @create 2017/8/11
 */
public class Default implements FunctionType {

  @Override
  public String getCode() {
    return "func.default";
  }

  @Override
  public String getName() {
    return "默认";
  }
}
