package com.jiawa.train.gateway.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

/**
 * @author 小小低头哥
 * @version v1.0
 * @api
 * @since 2024年 月 日
 */
@SpringBootApplication
@Slf4j
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(GatewayApplication.class);
        Environment env = app.run(args).getEnvironment();
        log.info("启动成功！！");
        log.info("网关地址：\thttp://127.0.0.1:{}",env.getProperty("server.port"));
    }
}
