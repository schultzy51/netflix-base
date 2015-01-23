package com.kschultz.mainapp.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {
    @RequestMapping("/")
    public String home() {
        log.info("This node!");
        return "test controller";
    }
}
