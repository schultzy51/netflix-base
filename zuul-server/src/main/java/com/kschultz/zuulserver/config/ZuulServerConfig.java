package com.kschultz.zuulserver.config;

import com.kschultz.zuulserver.filter.custom.TestCustomZuulFilter;
import com.kschultz.zuulserver.filter.post.TestPostZuulFilter;
import com.kschultz.zuulserver.filter.pre.TestPreZuulFilter;
import com.kschultz.zuulserver.filter.route.TestRouteZuulFilter;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;
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
    
    @Bean
    TestRouteZuulFilter testRouteZuulFilter() {
        return new TestRouteZuulFilter();
        
    }

    @Bean
    TestPostZuulFilter testPostZuulFilter() {
        return new TestPostZuulFilter();

    }

    @Bean
    TestCustomZuulFilter tesCustomZuulFilter() {
        return new TestCustomZuulFilter();

    }
}
