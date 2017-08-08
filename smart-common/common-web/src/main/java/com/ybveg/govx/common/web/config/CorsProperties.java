package com.ybveg.govx.common.web.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 跨域配置文件
 *
 * @auther zbb
 * @create 2017/8/7
 */
@ConfigurationProperties("smart.cors")
public class CorsProperties {

  /**
   * 跨域访问拦截 url
   */
  private String path = "/**";
  /**
   * 允许跨域的访问的URL
   */
  private String[] allows;

  /**
   * 跨域访问方式
   */
  private String[] methods = {"PUT", "DELETE", "GET", "POST"};


  public String[] getAllows() {
    return allows;
  }

  public void setAllows(String[] allows) {
    this.allows = allows;
  }

  public String[] getMethods() {
    return methods;
  }

  public void setMethods(String[] methods) {
    this.methods = methods;
  }

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }
}
