package com.kschultz.mainapp;

import com.kschultz.mainapp.config.NetflixEurekaClientConfig;
import com.kschultz.mainapp.config.WebConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@EnableAutoConfiguration
@Import({WebConfig.class, NetflixEurekaClientConfig.class})
@Configuration
public class Application {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
