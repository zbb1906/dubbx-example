package com.ybveg.govx.common.web.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @auther zbb
 * @create 2017/8/2
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

  /**
   * 利用fastjson替换掉jackson，且解决中文乱码问题
   */
  @Override
  public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
    FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
    FastJsonConfig fastJsonConfig = new FastJsonConfig();
    fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
    //处理中文乱码问题
    List<MediaType> fastMediaTypes = new ArrayList<>();
    fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
    fastConverter.setSupportedMediaTypes(fastMediaTypes);
    fastConverter.setFastJsonConfig(fastJsonConfig);
    converters.add(fastConverter);
  }

}