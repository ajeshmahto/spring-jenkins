package com.example.springjenkins.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String greeting() {


        return "Hello World!";
    }

    public void some() {
        try {
            doSomething();
        } catch (Exception e) {
        }
    }

    private void doSomething() {
        int a[] = new int[]{0, 1, 2, 3, 0,};

        int b[] = new int[]{0, 1, 2, 3, 0,};
    }
}
