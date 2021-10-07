package com.example.exerciciosspring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    public static final String MESSAGE = "Hello Word!";

    @GetMapping(path = "/ola")
    public String hello() {
        return MESSAGE;
    }

    @PostMapping(path = {"/saudacao"})
    public String saudacao() {
        return MESSAGE + "(POST)";
    }

}
