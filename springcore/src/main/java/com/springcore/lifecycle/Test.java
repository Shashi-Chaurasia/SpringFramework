package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycle_config.xml");
		Samosa s1 =(Samosa) context.getBean("S1");
		System.out.println(s1);
		
		System.out.println("+++++++++++++++++++++++++++");
		
		Pepsi p1 = (Pepsi) context.getBean("p1");
		System.out.println(p1);
		
		
		context.registerShutdownHook();
		
		
		Kachauri k1 =(Kachauri) context.getBean("k1");
		System.out.println(k1);

	}

}
