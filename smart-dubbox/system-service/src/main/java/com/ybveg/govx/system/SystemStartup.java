package com.ybveg.govx.system;

import java.util.concurrent.CountDownLatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SystemStartup {

  private static final Logger logger = LoggerFactory.getLogger(SystemStartup.class);

  @Bean
  public CountDownLatch closeLatch() {  //利用 CountDownLatch保持线程阻塞
    return new CountDownLatch(1);
  }

  public static void main(String[] args) throws InterruptedException {
    long start = System.currentTimeMillis();
//    Class.forName("javax.servlet.Servlet");
//    Class.forName("org.springframework.web.context.ConfigurableWebApplicationContext");
//    SpringApplication.run(SystemStartup.class);
//    修改启动方式 强制不启动web
//    如果需要支持rest 需要引入相关web容器 和启动web
    ApplicationContext ctx = new SpringApplicationBuilder(SystemStartup.class).web(false).run(args);
    long time = (System.currentTimeMillis() - start) / 1000;
    logger.info("System Provider start success! times {}s", time);
    CountDownLatch closeLatch = ctx.getBean(CountDownLatch.class);
    closeLatch.await();
  }
}
