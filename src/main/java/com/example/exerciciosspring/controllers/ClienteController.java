package com.example.exerciciosspring.controllers;

import com.example.exerciciosspring.models.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @GetMapping("/qualquer")
    public Cliente getCliente() {
        return new Cliente(28, "Pedro", "76823380080");
    }

    @GetMapping("/{id}")
    public Cliente findById(@PathVariable int id) {
        return new Cliente(id, "Maria", "32143364016");
    }

    @GetMapping
    public Cliente findByIdGetParamInUrl(@RequestParam(name = "id", defaultValue = "1") int id) {
        return new Cliente(id, "João", "50056303092");
    }

}
