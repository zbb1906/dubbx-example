package com.ybveg.govx.module.function;

import com.ybveg.auth.FunctionType;

/**
 * @auther zbb
 * @create 2017/8/11
 */
public class Add implements FunctionType {

  @Override
  public String getCode() {
    return "func.add";
  }

  @Override
  public String getName() {
    return "添加";
  }

}
