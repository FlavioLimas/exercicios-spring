package com.example.exerciciosspring.controllers;

import com.example.exerciciosspring.models.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

    @GetMapping(path = "/clientes/qualquer")
    public Cliente getCliente() {
        return new Cliente(28, "Pedro", "76823380080");
    }

}
