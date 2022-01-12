package com.springcore.auto.wire.anotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/anotation/auto_config.xml");
		Employee emp1 = context.getBean("emp1" ,Employee.class);
		System.out.println(emp1);
		
		
		

	}

}
