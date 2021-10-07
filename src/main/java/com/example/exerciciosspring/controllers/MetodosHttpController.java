package com.example.exerciciosspring.controllers;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MetodosHttpController {

    public static final String MENSSAGE = "Requisição ";

    public String get() {
        return MENSSAGE + "GET";
    }

    public String post() {
        return MENSSAGE + "POST";
    }

    public String put() {
        return MENSSAGE + "PUT";
    }

    public String patch() {
        return MENSSAGE + "PATCH";
    }

    public String delete() {
        return MENSSAGE + "DELETE";
    }

}
