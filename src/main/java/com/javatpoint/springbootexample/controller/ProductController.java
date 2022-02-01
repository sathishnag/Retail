package com.javatpoint.springbootexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@GetMapping("getProdcts")
	public String getAllProsucts () {
		return "welcome to tsumitomo";
	}
	
}
