package com.zplus.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = "com.zplus.student")
public class Application {
    public static void main(String args[])
    {

        SpringApplication.run(Application.class,args);

    }
}
