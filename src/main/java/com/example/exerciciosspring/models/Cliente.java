package com.example.exerciciosspring.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente {

    private int id;
    private String nome;
    private String cpf;

    public Cliente(int id, String nome, String cpf) {
        super();
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

}
