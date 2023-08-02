package com.cogent.Batch65_SpringBootV02.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	
	@GetMapping("/add")
	public String addString(int num1, int num2) {
		return "<h1> <center>" + num1 + num2 + " </center> </h1>";
	}


}
