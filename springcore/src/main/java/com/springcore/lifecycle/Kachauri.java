package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Kachauri {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting kachuri ... ");
		this.price = price;
	}

	public Kachauri() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Kachauri [price=" + price + "]";
	}
	
	
	@PostConstruct
	public void start() {
		System.out.println(" Kachuri ... stat in");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("system end ...  ");
	}

}
