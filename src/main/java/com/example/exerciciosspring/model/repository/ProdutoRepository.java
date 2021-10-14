package com.example.exerciciosspring.model.repository;

import com.example.exerciciosspring.model.entity.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

}
