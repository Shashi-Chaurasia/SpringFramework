package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context = new  ClassPathXmlApplicationContext("com/springcore/standalone/collection/alone_config.xml");
	Person person = context.getBean("person1",Person.class);
	System.out.println(person.getFriend()); 
	System.out.println(person.getFriend().getClass().getName());
	System.out.println("___________________________________________________");
	System.out.println(person.getFeestructure());
	System.out.println("...............................");
	System.out.println(person.getProperties());
}

}
