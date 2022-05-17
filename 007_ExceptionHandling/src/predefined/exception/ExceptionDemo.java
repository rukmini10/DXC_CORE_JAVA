package predefined.exception;

public class ExceptionDemo {
public static int div(int number1,int number2) {
	int temp=0;
	try {
	temp=number1/number2;
	}catch(Exception e)
	{
		System.err.println(e.getMessage());
	}
	return temp;
}
	public static void main(String[] args) {
		int res=div(25,0);
		System.out.println("Result : "+res);

	}

}

