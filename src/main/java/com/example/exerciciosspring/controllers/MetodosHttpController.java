package com.example.exerciciosspring.controllers;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MetodosHttpController {

    public static final String MENSSAGE = "Requisição ";

    public String get() {
        return MENSSAGE + "GET";
    }
}
