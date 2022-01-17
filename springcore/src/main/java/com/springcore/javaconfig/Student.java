package com.springcore.javaconfig;



/*import org.springframework.stereotype.Component;*/

/*@Component("firstStudent")*/
public class Student {
	private Sammosa sammosa;
	public Student(Sammosa sammosa) {
		super();
		this.sammosa = sammosa;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sammosa getSamosa() {
		return sammosa;
	}
	public void setSamosa(Sammosa samosa) {
		this.sammosa = samosa;
	}
	public void study() {
		this.sammosa.price();;
		System.out.println("I am reading a book ! ");
	}

}
