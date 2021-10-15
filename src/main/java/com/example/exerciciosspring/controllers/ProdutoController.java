package com.example.exerciciosspring.controllers;

import com.example.exerciciosspring.model.entity.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @PostMapping
    public @ResponseBody Produto createProduct(@RequestParam String name) {
        return new Produto(name);
    }
}
