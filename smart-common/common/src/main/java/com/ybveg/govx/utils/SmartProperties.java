package com.ybveg.govx.utils;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Smart-GOVX 配置类
 *
 * @auther zbb
 * @create 2017/8/7
 */
@ConfigurationProperties("smart")
public class SmartProperties {

  /**
   * 支持跨域列表
   */
  private String[] cors;


  public String[] getCors() {
    return cors;
  }

  public void setCors(String[] cors) {
    this.cors = cors;
  }
}
