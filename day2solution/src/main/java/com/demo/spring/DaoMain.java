package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		
			
		ConcatString concat=(ConcatString)ctx.getBean("concatString");
		
		System.out.println(concat.getClass().getName());
		concat.joinString("Abhinay","Full Stack Developer");

	}

}
