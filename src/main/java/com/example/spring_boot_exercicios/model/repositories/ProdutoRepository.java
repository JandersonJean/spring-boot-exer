package com.example.spring_boot_exercicios.model.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.spring_boot_exercicios.model.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer>{
	
}
