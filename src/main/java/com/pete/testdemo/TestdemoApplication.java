package com.pete.testdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TestdemoApplication {
/***
*TEST
***/
    @GetMapping("/")
    public String index(){
        System.out.println("test");
        return "Hello Spring Boot";
    }
    public static void main(String[] args) {
        SpringApplication.run(TestdemoApplication.class, args);
    }

}
