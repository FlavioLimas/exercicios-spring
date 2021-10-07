package com.example.exerciciosspring.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    public static final String MESSAGE = "Hello Word!";

    @RequestMapping
    public String hello() {
        return MESSAGE;
    }

}
