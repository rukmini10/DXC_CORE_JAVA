package com.training;

public class Student {
	private int rollNumber;
	private String firstName;
	private String lastName;
	private String stream;
	private float subject1;
	private float subject2;
	private float subject3;
	
	public Student() {
		
	}
	
	
	public Student(int rollNumber, String firstName, String lastName, String stream, float subject1, float subject2,
			float subject3) {
	
		this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.stream = stream;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
	}


	@Override
	public String toString() {
		return "\nrollNumber=" + rollNumber + ", firstName=" + firstName + ", lastName=" + lastName + ", stream="
				+ stream + ", subject1=" + subject1 + ", subject2=" + subject2 + ", subject3=" + subject3 ;
	}
	
	public float avgMarks() {
		return (this.subject1+this.subject2+this.subject3)/3;
	}
	
	
}
