package com.example.exerciciosspring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    @GetMapping("/somar/{n1}/{n2}")
    public List<Integer> somar(@PathVariable Integer n1, @PathVariable Integer n2) {
        return List.of(n1, n2);
    }


}
