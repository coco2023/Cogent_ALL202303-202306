package com.cogent.Batch65_SpringBootV04.Service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyServiceClass {
	@Value(value = "100")
	int info;
	
	@Value("${java.home}")
	private String javahome;

	public int factorial(int i) {
		// TODO Auto-generated method stub
		if (i == 0) {
			return 1;
		}
		return i * factorial(i - 1);
	}

}
