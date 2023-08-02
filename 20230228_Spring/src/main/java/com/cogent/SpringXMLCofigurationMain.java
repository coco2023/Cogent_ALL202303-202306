package com.cogent;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXMLCofigurationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("/com/cogent/Spring/ApplicationContext.xml");
		
		Country countryBean = (Country) ac.getBean("country2");
		
		String name = countryBean.getName();
		System.out.println("Country name: " + name);
		
		long population = countryBean.getPopulation();
		
		System.out.println("Country population: " + population);

		ac.close();
	}

}
