package com.example.testapp;

import com.example.starterlogs.Loggable;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.batch.BatchAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication(exclude = {BatchAutoConfiguration.class})
@EnableBatchProcessing
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan(basePackages = "com.example")
public class TestAppApplication {


    public static void main(String[] args) {
        SpringApplication.run(TestAppApplication.class, args);
        System.out.println("Test App is running...");
    }
}
