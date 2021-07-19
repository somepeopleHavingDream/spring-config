package org.yangxin.config.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * eureka开启服务无法连接注册中心。
 * Spring Cloud2.0以上Security默认开启了csrf检验，要在eureka server端配置security的csrf检验为false。
 *
 * @author yangxin
 * 2021/7/16 9:19
 */
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        super.configure(http);
    }
}
