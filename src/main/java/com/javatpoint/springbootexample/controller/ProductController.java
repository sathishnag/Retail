package com.javatpoint.springbootexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

@RestController
public class ProductController {
	
	@GetMapping("getProdcts")
	public ResponseEntity<String> getAllProsucts () {
		return new ResponseEntity<>("test", HttpStatus.OK);
	}
	
}
