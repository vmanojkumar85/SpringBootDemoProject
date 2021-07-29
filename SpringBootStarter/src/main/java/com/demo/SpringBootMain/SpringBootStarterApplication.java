package com.demo.SpringBootMain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.SpringBootService.PrimaryService;

@SpringBootApplication(scanBasePackages="com.demo")
public class SpringBootStarterApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringBootStarterApplication.class, args);
		PrimaryService ps=context.getBean("primaryService",PrimaryService.class);
		ps.print();
		
		
		//Inversion of control : https://www.baeldung.com/inversion-control-and-dependency-injection-in-spring
		//https://springframework.guru/spring-external-configuration-data/
		//https://docs.spring.io/spring-boot/docs/1.0.1.RELEASE/reference/html/boot-features-external-config.html
	}
	//https://github.com/vmanojkumar85/SpringBootDemoProject.git
}
