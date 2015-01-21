package com.kschultz.cloudconfigserver;

import com.kschultz.cloudconfigserver.config.CloudConfigServerConfig;
import com.kschultz.cloudconfigserver.config.NetflixEurekaClientConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@EnableAutoConfiguration
@Import({CloudConfigServerConfig.class, NetflixEurekaClientConfig.class})
@Configuration
public class Application {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
