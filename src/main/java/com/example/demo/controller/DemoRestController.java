package com.example.demo.controller;

import com.example.demo.config.ApplicationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoRestController {

    private final ApplicationProperties applicationProperties;

    public DemoRestController(ApplicationProperties applicationProperties) {
        this.applicationProperties = applicationProperties;
    }

    @GetMapping("/print")
    public @ResponseBody String getPropertyValue() {

        return applicationProperties.getProperty();
    }
}
