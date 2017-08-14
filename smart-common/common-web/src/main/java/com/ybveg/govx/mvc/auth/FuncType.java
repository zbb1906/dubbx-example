package com.ybveg.govx.mvc.auth;

/**
 * 功能基类 所有功能都要继承此接口
 *
 * @auther zbb
 * @create 2017/8/11
 */
public interface FuncType {

  /**
   * 功能编码
   */
  String getCode();

  /**
   * 功能名称
   */
  String getName();

  /**
   * 功能说明
   */
  String desc();

}
