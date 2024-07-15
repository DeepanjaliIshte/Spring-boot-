package com.springboot.program;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Main {
	public static void main(String[] args) {
		 ApplicationContext context=SpringApplication.run(Main.class, args);
		 
		 Person person=context.getBean(Person.class); 
		 person.eat();
		
		System.out.println("Welcome to first spring boot program");
		
		/*
		 * ApplicationContext con=new AnnotationConfigApplicationContext(Config.class);
		 * 
		 * Person person=con.getBean(Person.class); person.eat();
		 */
	}
}
