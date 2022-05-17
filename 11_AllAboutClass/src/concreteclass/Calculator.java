/*
 * A concrete class is a class that we can create an instance of, 
 * using the new keyword.
 *  In other words, it's a full implementation of its blueprint.
 *   A concrete class is complete.
 */


package concreteclass;

public class Calculator {
public String compareNumbers(int num1,int num2) {
	String res=null;
	if(num1>num2) {
		res=num1+" is bigger than "+num2;
	}
	else if(num1<num2) {
		res=num1+" is smaller than "+num2;
	}
	else {
		res=num1+" and "+num2+" both are equal";
	}
	return res;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculator calc=new Calculator();
System.out.println("\n"+calc.compareNumbers(12, 45));
System.out.println("\n"+calc.compareNumbers(95, 45));
System.out.println("\n"+calc.compareNumbers(12, 12));
	}

}
