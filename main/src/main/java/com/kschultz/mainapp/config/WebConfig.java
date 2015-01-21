package com.kschultz.mainapp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@ComponentScan("com.kschultz.mainapp.web.controller")
@Configuration
public class WebConfig {
}
