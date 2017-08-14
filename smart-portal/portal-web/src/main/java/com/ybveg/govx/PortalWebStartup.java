package com.ybveg.govx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
//@ComponentScan({"com.ybveg.govx.common.web.config", "com.ybveg.jwt"})
public class PortalWebStartup {

  public static void main(String[] args) throws ClassNotFoundException {
    SpringApplication.run(PortalWebStartup.class, args);
  }
}
