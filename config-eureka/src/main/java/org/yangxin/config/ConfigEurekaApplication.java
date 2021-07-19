package org.yangxin.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author yangxin
 * 2021/7/15 17:51
 */
@EnableEurekaServer
@SpringBootApplication
public class ConfigEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigEurekaApplication.class, args);
    }
}
