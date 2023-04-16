package com.SpringIOC.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.SpringIOC.example.Service.ServiceClass;

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(ExampleApplication.class, args);
		
		ServiceClass serviceClass = ctx.getBean(ServiceClass.class);
		
		serviceClass.doSomething();
	}
}
