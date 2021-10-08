package com.example.exerciciosspring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    @GetMapping("/somar/{n1}/{n2}")
    public Integer somar(@PathVariable Integer n1, @PathVariable Integer n2) {
        return n1 + n2;
    }

    @GetMapping("/subtrair")
    public Integer subtrair(@RequestParam(name = "a") Integer a, @RequestParam(name = "b") Integer b) {
        return a - b;
    }

}
