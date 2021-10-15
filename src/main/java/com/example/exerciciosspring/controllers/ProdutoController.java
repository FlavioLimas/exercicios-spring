package com.example.exerciciosspring.controllers;

import com.example.exerciciosspring.model.entity.Product;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @PostMapping
    public @ResponseBody
    Product createProduct(@RequestParam String name) {
        return new Product(name);
    }

}
