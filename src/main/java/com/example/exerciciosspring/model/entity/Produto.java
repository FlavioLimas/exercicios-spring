package com.example.exerciciosspring.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Getter
@Setter
@Entity
public class Produto {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;
}
