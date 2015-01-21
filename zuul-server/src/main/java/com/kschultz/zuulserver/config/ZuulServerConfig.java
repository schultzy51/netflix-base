package com.kschultz.zuulserver.config;

import com.kschultz.zuulserver.filter.pre.TestPreZuulFilter;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableZuulProxy
//@EnableZuulServer
@Configuration
public class ZuulServerConfig {
    @Bean
    TestPreZuulFilter testPreZuulFilter() {
        return new TestPreZuulFilter();
    }
}
