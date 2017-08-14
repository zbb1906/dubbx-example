package com.ybveg.govx.mvc.auth;

/**
 * 功能基类 所有模块都要继承此接口<br/>
 *
 * 功能 < 模块(系统定义)
 *
 * @auther zbb
 * @create 2017/8/11
 */
public interface ModuleType {

  /**
   * 模块编码 编码规则 <br/>
   *
   * 工程名.包名.模块名 例如: <b>system.admin.module</b>
   */
  String getCode();

  /**
   * 模块名称
   */
  String getName();

}
