package com.training;

public class Person {

    String firstName;
	String lastName;
	int age;
	long contactNumber;
//1.Name of constructor should be same as class name
//2.no return type required, never return any value
//3.can be create more than one constructor for same class
//4.no call is required its called automatically when we create object
//5.if we are not created any constructor then only JVM creates default constructor
//6.it cannot be override by child class
	
	
	
	
//default constructor	
	public Person() {
		firstName="Chebrolu";
		lastName="Rukmini";
		age=22;
		contactNumber=9505918828l;
	}
	
	//parameterized constructor
	
	public Person(String firstName, String lastName, int age, long contactNumber) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.age = age;
	this.contactNumber = contactNumber;

	}

	// if you remove this there would be no error but it displays null 
		//that is member variable
	
	
	//copy constructor
	public Person(Person person) {
	
	this.firstName = person.firstName;
	this.lastName = person.lastName;
	this.age = person.age;
	this.contactNumber = person.contactNumber;

	}
	
		
//toString()

	@Override
	public String toString() {
		return "\nfirstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", contactNumber="
				+ contactNumber ;
	}


	public static void main(String args[]) {
		Person person1=new Person();
		System.out.println(person1);
		Person person2=new Person("Sita","Ch",20,8545689854l);
		System.out.println(person2);
		Person person3=new Person(person1);
		System.out.println(person3);
	}
}
