package com.springcore.ci;

public class Adition {
	private int a;
	private int b;
	
	public Adition(int a , int b) {
		this.a = a;
		this.b = b;
		System.out.println("constructore :int ,int " );
	}
	
	public Adition(double a, double b) {
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("constructor of double : double , double");
		
	}
	public Adition(String a, String b ) {
		this.a =Integer.parseInt(a);
		this.b =Integer.parseInt(b);
		System.out.println("Constructor of String : String , String");
	}
	public void doSum() {
		System.out.println("Sum of this number is = "+ (this.a + this.b));
	}
	

}


