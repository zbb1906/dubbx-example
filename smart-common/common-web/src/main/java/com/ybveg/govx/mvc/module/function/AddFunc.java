package com.ybveg.govx.mvc.module.function;

import com.ybveg.govx.mvc.auth.FuncType;

/**
 * @auther zbb
 * @create 2017/8/11
 */
public class AddFunc implements FuncType {

  @Override
  public String getCode() {
    return "func.add";
  }

  @Override
  public String getName() {
    return "添加";
  }

  @Override
  public String desc() {
    return "添加功能按钮";
  }
}
