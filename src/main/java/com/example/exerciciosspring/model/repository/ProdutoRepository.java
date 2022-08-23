package com.example.exerciciosspring.model.repository;

import com.example.exerciciosspring.model.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends CrudRepository<Product, Integer> {

}
