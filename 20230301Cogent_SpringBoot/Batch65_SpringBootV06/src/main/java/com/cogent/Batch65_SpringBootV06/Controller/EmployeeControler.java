package com.cogent.Batch65_SpringBootV06.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeControler {
	
	@GetMapping("/get")
	public String get() {
		System.out.println("Success!");
		return "Success!";
	}

}
