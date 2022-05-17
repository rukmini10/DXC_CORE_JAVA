package com.training;

public class Rectangle implements AreaCalculator {

	@Override
	public double findArea() {
		float length=34.5f,breadth=17.8f;
		return length*breadth;
	}
	

}
