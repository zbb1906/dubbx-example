package com.ybveg.govx.data.config;

import java.util.Properties;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

/**
 * MyBatis扫描接口，使用的tk.mybatis.spring.mapper.MapperScannerConfigurer， 如果你不使用通用Mapper，可以改为org.mybatis.spring.mapper....
 * 注意，由于MapperScannerConfigurer执行的比较早，所以必须有下面的注解
 *
 * @author liuzh
 * @since 2015-12-19 14:46
 */
@Configuration
@AutoConfigureAfter(MyBatisConfiguration.class)
public class MapperScannerConfiguration {

  @Bean
  public MapperScannerConfigurer mapperScannerConfigurer() {
    MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
    mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
    //mapperScannerConfigurer.setBasePackage("tk.mybatis.springboot.mapper");
    mapperScannerConfigurer.setBasePackage("com.ybveg.govx.**.mapper.**");
    mapperScannerConfigurer.getMapperHelper().getConfig().setOrder("BEFORE");  //回写uuid配置
    Properties properties = new Properties();

    properties.setProperty("mappers", "com.ybveg.govx.system.myMapper.BaseMapper");

    properties.setProperty("notEmpty", "false");
    properties.setProperty("IDENTITY", "MYSQL");
    mapperScannerConfigurer.setProperties(properties);
    return mapperScannerConfigurer;
  }

}