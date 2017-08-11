package com.ybveg.govx.mvc.module.function;

import com.ybveg.govx.mvc.auth.FuncType;

/**
 * 每个模块都有一个默认功能
 *
 * @auther zbb
 * @create 2017/8/11
 */
public class DefaultFunc implements FuncType {

  @Override
  public String getCode() {
    return "func.default";
  }

  @Override
  public String getName() {
    return "默认";
  }

  @Override
  public String desc() {
    return "每个模块都有一个默认功能";
  }
}
