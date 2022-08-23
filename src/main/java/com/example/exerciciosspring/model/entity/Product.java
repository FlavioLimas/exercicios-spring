package com.example.exerciciosspring.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

@Entity
public class Product implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    public Product(String nome) {
        this.name = nome;
    }

}
