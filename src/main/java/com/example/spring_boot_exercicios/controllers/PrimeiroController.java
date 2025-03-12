package com.example.spring_boot_exercicios.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {
	//@RequestMapping(method = RequestMethod.GET, path = "/ola") //Por padrao GET
	@GetMapping(path = "ola")
	public String ola() {
		return "Olá, Bem vindo ao Spring Boot";
	}

}
