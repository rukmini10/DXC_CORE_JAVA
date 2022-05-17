package com.training;

public class CalculatorService {

	public static void main(String[] args) {
		AreaCalculator calc=new Rectangle();
		System.out.println(calc.findArea());
	calc=new Circle();
		System.out.println(calc.findArea());
		
		
		
		Calculator cal=new CalculatorImpl();
		System.out.println(cal.countDigits(7845897));
	}

}
