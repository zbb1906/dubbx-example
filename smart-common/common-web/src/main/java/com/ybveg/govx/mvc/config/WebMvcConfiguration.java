package com.ybveg.govx.mvc.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.ybveg.auth.AuthAbstractManager;
import com.ybveg.govx.mvc.interceptor.AuthorizationInterceptor;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @auther zbb
 * @create 2017/8/2
 */
@Configuration
@EnableConfigurationProperties(CorsProperties.class)
public class WebMvcConfiguration extends WebMvcConfigurerAdapter {

  @Autowired
  private CorsProperties cors;

//  @Autowired
//  @SuppressWarnings("SpringJavaAutowiringInspection")
//  private AuthAbstractManager manager;  //权限

  /**
   * 利用fastjson替换掉jackson，且解决中文乱码问题
   */
  @Bean
  public HttpMessageConverters fastJsonHttpMessageConverters() {
    FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
    FastJsonConfig fastJsonConfig = new FastJsonConfig();
    fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
    List<MediaType> fastMediaTypes = new ArrayList<>();
    fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
    fastConverter.setSupportedMediaTypes(fastMediaTypes);
    fastConverter.setFastJsonConfig(fastJsonConfig);
    HttpMessageConverter<?> converter = fastConverter;
    return new HttpMessageConverters(converter);
  }

  /**
   * Spring 前后端分离 跨域问题
   */
  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping(cors.getPath())
        .allowedOrigins(cors.getAllows())
        .allowedMethods(cors.getMethods())
        .allowedHeaders("*")
        .exposedHeaders("access-control-allow-headers",
            "access-control-allow-methods",
            "access-control-allow-origin",
            "access-control-max-age",
            "X-Frame-Options")
        .allowCredentials(false).maxAge(3600);
  }

//  @Override
//  public void addInterceptors(InterceptorRegistry registry) {
////    AuthorizationInterceptor interceptor = new AuthorizationInterceptor(manager);
//
//    registry.addInterceptor(interceptor).addPathPatterns("/**")
//        .excludePathPatterns("/login", "/error", "/reset");
//    super.addInterceptors(registry);
//  }
}
