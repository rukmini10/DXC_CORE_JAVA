package com.training;

public class StudentService {
	public static void main(String[] args) {
		Student student=new Student(298,"chebrolu","Rukmini","CSE",90,92,95);
		System.out.println(student);
		System.out.println("Student AVG Marks:"+student.avgMarks());
	}

}
