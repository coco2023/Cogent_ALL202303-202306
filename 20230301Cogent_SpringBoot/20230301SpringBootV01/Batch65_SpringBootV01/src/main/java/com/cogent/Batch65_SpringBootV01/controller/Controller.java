package com.cogent.Batch65_SpringBootV01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {  // Http Methods gets defined
	
//	@GetMapping("/hello") // End points URL for RestAPI
//	public String hello() {
//		return "<h1 style=\"color: pink;\"> <center> Hi! Keyu Han </center> </h1>";
//	}
	
	@GetMapping("/add") // End points URL for RestAPI
	public String add() {
		return "<h1 style=\"color: pink;\"> <center> " + 3 + 4 + " </center> </h1>";
	}
	
}
