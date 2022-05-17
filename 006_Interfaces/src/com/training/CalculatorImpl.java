package com.training;

public class CalculatorImpl implements Calculator{

	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compare(int num1, int num2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int numPower(int base, int p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int countDigits(int num) {
	int count=0;
		for(int temp=num;temp>0;temp/=10) {
		count++;
	}
		return count;
	}

}
/*

define an interface called Language having following abstract methods
lanType()-telugu,hindi,eng-tamil
getVersion()



*/