package com.cogent.SpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	// End Points URL for REST Apis.

	@GetMapping("/hello")
	public String helloString() {
		return "<h1 style=\"color: pink;\">Keyu Han</h1>";
	}
	
	@GetMapping("/add")
	public String addString(int num1, int num2) {
		return "<h1> <center>" + num1 + num2 + " </center> </h1>";
	}

}
