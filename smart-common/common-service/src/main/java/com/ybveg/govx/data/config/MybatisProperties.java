package com.ybveg.govx.data.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by Administrator on 2017/8/15.
 */
@ConfigurationProperties(prefix = "mybatis")
@Getter
@Setter
public class MybatisProperties {

  private String basePackage;
  private String aliasPackage;
}
