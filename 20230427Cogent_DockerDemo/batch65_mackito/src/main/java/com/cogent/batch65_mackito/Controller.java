package com.cogent.batch65_mackito;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("hello")
	public String hello() {
		System.out.println("Hello");
		return "Hello Docker";

	}

}
