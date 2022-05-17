package com.training;

public class Calculator {

	public static void main(String[] args) {
		Calc sc=new Calc(25,25);
		System.out.println(sc);
		System.out.println("Addition:"+sc.add());
		System.out.println("Subtraction:"+sc.subtract());
		System.out.println("Multiplication:"+sc.multiply());
		System.out.println("Divisionn:"+sc.divide());
		

	}

}
