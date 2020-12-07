package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        System.out.println("args = " + args);
        System.out.println("测试提交到分支");
        SpringApplication.run(DemoApplication.class, args);
    }

}
