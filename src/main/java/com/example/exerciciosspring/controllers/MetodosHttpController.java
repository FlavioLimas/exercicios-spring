package com.example.exerciciosspring.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/metodos")
public class MetodosHttpController {

    public static final String MENSSAGE = "Requisição ";

    @GetMapping
    public String get() {
        return MENSSAGE + "GET";
    }

    @PostMapping
    public String post() {
        return MENSSAGE + "POST";
    }

    @PutMapping
    public String put() {
        return MENSSAGE + "PUT";
    }

    @PatchMapping
    public String patch() {
        return MENSSAGE + "PATCH";
    }

    @DeleteMapping
    public String delete() {
        return MENSSAGE + "DELETE";
    }

}
