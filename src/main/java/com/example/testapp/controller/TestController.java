package com.example.testapp.controller;

import com.example.starterlogs.Loggable;


import com.example.testapp.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestService testService;



    @Loggable
    @GetMapping("/test")
    public String testMethod(@RequestParam String name) {
        return testService.processName(name);
    }






    @Loggable
    public void testLoggable() {
        System.out.println("Inside testLoggable method");
    }


}
