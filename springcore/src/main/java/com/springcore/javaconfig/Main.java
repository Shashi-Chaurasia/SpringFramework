package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;




public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(javaconfig.class);
		Student student = context.getBean("temp" , Student.class);
		System.out.println(student);
		student.study();
		
	}

}
