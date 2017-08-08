package com.ybveg.govx.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({"com.ybveg.govx.common.web.config"})
public class PortalWebStartup {

  public static void main(String[] args) throws ClassNotFoundException {
    SpringApplication.run(PortalWebStartup.class, args);
  }
}
