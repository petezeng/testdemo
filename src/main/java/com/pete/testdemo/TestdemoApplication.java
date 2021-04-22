package com.pete.testdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TestdemoApplication {

    @GetMapping("/hh")
    public String index(){
        return "Hello Spring Boot";
    }
    public static void main(String[] args) {
        SpringApplication.run(TestdemoApplication.class, args);
    }

}
