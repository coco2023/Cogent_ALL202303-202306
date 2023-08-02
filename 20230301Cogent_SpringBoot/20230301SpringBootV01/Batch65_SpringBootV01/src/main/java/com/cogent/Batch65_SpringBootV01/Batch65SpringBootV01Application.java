package com.cogent.Batch65_SpringBootV01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class Batch65SpringBootV01Application {

	public static void main(String[] args) {
		SpringApplication.run(Batch65SpringBootV01Application.class, args);
	}

}
