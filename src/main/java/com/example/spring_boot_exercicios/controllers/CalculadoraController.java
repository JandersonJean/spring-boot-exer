package com.example.spring_boot_exercicios.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calc")
public class CalculadoraController {
	
	@GetMapping("somar/{a}/{b}")
	public int somar(@PathVariable int a,@PathVariable int b) {
		int soma = a + b;
		return soma;
	}
	@GetMapping("/subtrair")
	public int subtrair(@RequestParam(name = "a") int a, @RequestParam(name = "b") int b) {
		int sub = a - b;
		return sub;
	}
	
}
