package com.ybveg.govx.mvc.module.function;

import com.ybveg.govx.mvc.auth.FuncType;

/**
 * 默认功能
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
    return "默认功能";
  }
}
