package com.example.exerciciosspring.controllers;

import com.example.exerciciosspring.models.Cliente;

public class ClienteController {

    public Cliente getCliente() {
        return new Cliente(28, "Pedro", "76823380080");
    }

}
