package calc;

public class LogicalCalculator extends Calculator{

	public boolean isEven(int num) {
		if(num%2==0)
			return true;
		else
			return false;
	}
	
	
	@Override
	public void show(int val) {
		// TODO Auto-generated method stub
		System.out.println("Result is:"+val);
		System.out.println("Result is even:"+isEven(val));
		
	}

}
/*
any class thats object you can create is called concreet class
any class thats object can not create is called abstract class
*/