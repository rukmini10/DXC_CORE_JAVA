package calc;
import java.util.Scanner;
public class InputOutput {
	private Scanner sc;
	
	
	
public InputOutput() {
		sc=new Scanner(System.in);
	}

	//method to get integer by passing message
	public int input(String message) {
		int temp;
System.out.print("\n"+message);
temp=sc.nextInt();
return temp;
	}
	public void output(String message,int val) {
		System.out.println("\n"+message+":"+val);
	}
	public void output(String message) {
		System.out.println("\n"+message);
	}
	public void error(String message) {
		System.err.println("\n"+message);
	}
}
