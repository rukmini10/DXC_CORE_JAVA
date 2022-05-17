package com.dxc.insurance;
public class Driver 
{
	String name;
	int age;
	
	
	public Driver(String name, int age) {
		//super();
		this.name = name;
		this.age = age;
	}
	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void displayInfo()
	{
		System.out.println("Name of the driver "+this.name);
		System.out.println("Age of the driver "+this.age);
	}
	@Override
	public String toString() {
		return "Driver [name=" + name + ", age=" + age + "]";
	}
}
