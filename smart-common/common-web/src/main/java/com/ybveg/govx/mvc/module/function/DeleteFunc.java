package com.ybveg.govx.mvc.module.function;

import com.ybveg.govx.mvc.auth.FuncType;

/**
 * @auther zbb
 * @create 2017/8/11
 */
public class DeleteFunc implements FuncType {

  @Override
  public String getCode() {
    return "func.delete";
  }

  @Override
  public String getName() {
    return "删除";
  }

  @Override
  public String desc() {
    return "删除功能";
  }
}
