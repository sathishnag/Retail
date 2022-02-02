package com.javatpoint.springbootexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@RestController
public class ProductController {
	
	@GetMapping("getProdcts")
	public ResponseEntity<String> getAllProsucts () {
		return ResponseEntity.ok("welcome");
	}
	
}
