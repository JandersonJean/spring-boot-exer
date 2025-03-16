package com.example.spring_boot_exercicios.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_boot_exercicios.model.entities.Produto;
import com.example.spring_boot_exercicios.model.repositories.ProdutoRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
	@Autowired
	private ProdutoRepository produtoRepository;
	
	
	@PostMapping
	public @ResponseBody Produto novoProduto(@Valid Produto produto) {
		//Produto produto = new Produto(nome, preco, desconto);
		produtoRepository.save(produto);
		return produto;
	}
	@GetMapping
	public Iterable<Produto> obterProduto(){
		return produtoRepository.findAll();
	}
}
