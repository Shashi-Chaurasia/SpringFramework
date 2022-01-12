package com.springcore.auto.wire.anotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	private Address address;

	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		System.out.println("Inside setter");
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Autowired
	public Employee(Address address) {
		super();
		System.out.println("Inside constructor ");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

}
