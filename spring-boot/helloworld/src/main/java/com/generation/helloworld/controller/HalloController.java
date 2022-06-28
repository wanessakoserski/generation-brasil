package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HalloController {

	@GetMapping
	public String hello() {
		return "hello world";
	}
	
	@GetMapping("/{name}")
	public String objetivos(@PathVariable String name) {
		String retorno = "Meu nome é " + name
				+ "\nMeus objetivos para essa semana é "
				+ "estudar Spring Boot e Java";
		return retorno;
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		String ListaBSM = 
				"\n** Mentalidade **"
				+ "\n - Orientação ao Futuro"
				+ "\n - Responsabilidade Pessoal"
				+ "\n - Mentalidade de Crescimento"
				+ "\n - Persistência"
				+ "\n"
				+ "\n** Competência **"
				+ "\n - Comunicação"
				+ "\n - Proatividade"
				+ "\n - Orientação ao Detalhe"
				+ "\n - Trabalho em Equipe";
		
		return ListaBSM;
	}
	
}
