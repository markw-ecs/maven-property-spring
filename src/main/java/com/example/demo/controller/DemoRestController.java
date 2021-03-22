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
    public @ResponseBody Output getPropertyValue() {

        Output output = new Output();
        output.setProperty1(applicationProperties.getProperty());
        output.setProperty2(applicationProperties.getProperty2());

        return output;
    }

    public static class Output {
        private String property1;
        private String property2;

        public String getProperty1() {
            return property1;
        }

        public void setProperty1(String property1) {
            this.property1 = property1;
        }

        public String getProperty2() {
            return property2;
        }

        public void setProperty2(String property2) {
            this.property2 = property2;
        }
    }
}


