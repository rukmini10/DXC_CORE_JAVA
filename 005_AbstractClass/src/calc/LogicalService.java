package calc;

public class LogicalService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LogicalCalculator calc=new LogicalCalculator();
		calc.show(calc.sum(12, 10, 8));

		
		FindSmaller smaller=new FindSmaller();
		smaller.show(smaller.smaller(34,89));
	}

}

/*this works as abstract class
//Lets create an abstract class Employee and derived two child classes as manager and clerk
//lets create an abstract class BankAccount and derived two child classes as savings account ,
current account, fixeddeposit account 
//lets create an abstract class shape and child class as rectangle, square , circle etc
//Lets create an abstract class Shape and child classes as Rectangle,Square,Circle etc
//Lets create an abstract class Animal having sound() as abstract,child class Dog,Cat,Loin
*/