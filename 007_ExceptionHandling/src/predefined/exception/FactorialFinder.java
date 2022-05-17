
/*
java code to get a number and find out its factorial
if num>0 then it should work find factorial
else no need to work show error show exception
exception handling try catch use

class:FactorialFinder
method:findFactorial(int)
method:main()
1.get a number
2.create object of FactorialFinder
3.call findFactorial()

*/


package predefined.exception;

public class FactorialFinder {
public int findFactorial(int num) {
	int fact=1;
	try {
	if(num<1) {
	throw new IllegalArgumentException("Number must be greater than 0");
     	}
	for(int i=num;i>0;i--) {
		fact=fact*i;
	     }
	
    }catch(Exception e) {
    	System.err.println(e.getMessage());
    	e.fillInStackTrace();
    }
	return fact;
	
}
	public static void main(String[] args) {
		FactorialFinder factorial=new FactorialFinder();
		System.out.println(factorial.findFactorial(5));
	}

}























