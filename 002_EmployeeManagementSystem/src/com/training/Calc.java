package com.training;
import java.util.Scanner;
public class Calc{
	private int firstNumber;
	private int secondNumber;
	
		
	
	
	public Calc(int firstNumber, int secondNumber) {
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	
	}
	

	@Override
	public String toString() {
		return "\nfirstNumber=" + firstNumber + ", secondNumber=" + secondNumber;
	}
	public float add() {
		return (this.firstNumber+this.secondNumber);
	}
	public float subtract() {
		return (this.firstNumber-this.secondNumber);
	}
	public float divide() {
		return (this.firstNumber/this.secondNumber);
	}
	public float multiply() {
		return (this.firstNumber*this.secondNumber);
	}
	
	public float compare() {
		 
		return (this.firstNumber=this.secondNumber);
		       
		    
		 
		
	}
}
