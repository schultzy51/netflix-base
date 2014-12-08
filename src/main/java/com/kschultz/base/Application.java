package com.kschultz.base;

import com.kschultz.base.config.NetflixConfig;
import com.kschultz.base.config.WebConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@EnableAutoConfiguration
@Import({WebConfig.class, NetflixConfig.class})
@Configuration
public class Application {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
