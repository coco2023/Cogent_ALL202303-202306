package com.cogent.Batch65_SpringBootV02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class Batch65SpringBootV02Application {

	public static void main(String[] args) {
		SpringApplication.run(Batch65SpringBootV02Application.class, args);
	}

}
