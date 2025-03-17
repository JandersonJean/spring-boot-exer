package com.example.spring_boot_exercicios.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.spring_boot_exercicios.model.entities.Produto;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer>, CrudRepository<Produto, Integer>{
	
	public Iterable<Produto> findByNomeContaining(String parteNome);
}
