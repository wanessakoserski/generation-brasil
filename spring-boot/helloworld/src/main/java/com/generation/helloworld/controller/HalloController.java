package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/hello")
public class HalloController {

	@GetMapping
	public String hello() {
		return "hello world";
	}
	
}
