package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("Shashi")
	private String studentName;
	@Value("Hyderabad")
	private String city;
	
	private List<Integer> phoneNumber;
	public List<Integer> getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(List<Integer> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + "]";
	}
	
	

}
