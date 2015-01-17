package com.kschultz.zuulserver.config;

import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;
import org.springframework.context.annotation.Configuration;

@EnableZuulProxy
//@EnableZuulServer
@Configuration
public class ZuulServerConfig {
}
