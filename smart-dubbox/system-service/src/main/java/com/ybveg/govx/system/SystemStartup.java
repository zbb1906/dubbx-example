package com.ybveg.govx.system;

import com.ybveg.auth.config.AuthAutoConfiguration;
import java.util.concurrent.CountDownLatch;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

// 不启动 AuthAutoConfiguration 引入进来主要是dubbo 要多实体类序列化
@Slf4j
@SpringBootApplication(exclude = AuthAutoConfiguration.class)

public class SystemStartup {

  public static void main(String[] args) throws InterruptedException {
    long start = System.currentTimeMillis();
//    Class.forName("javax.servlet.Servlet");
//    Class.forName("org.springframework.web.context.ConfigurableWebApplicationContext");
//    SpringApplication.run(SystemStartup.class);
//    修改启动方式 强制不启动web
//    如果需要支持rest 需要引入相关web容器 和启动web
    ApplicationContext ctx = new SpringApplicationBuilder(SystemStartup.class).web(false).run(args);
    long time = (System.currentTimeMillis() - start) / 1000;
    log.info("System Provider start success! times {}s", time);
    CountDownLatch closeLatch = ctx.getBean(CountDownLatch.class);
    closeLatch.await();
  }

  @Bean
  public CountDownLatch closeLatch() {  //利用 CountDownLatch保持线程阻塞
    return new CountDownLatch(1);
  }
}
