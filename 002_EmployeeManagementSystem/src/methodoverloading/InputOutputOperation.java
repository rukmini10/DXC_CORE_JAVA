package methodoverloading;
import java.util.Scanner;


public class InputOutputOperation {
private Scanner keyboard;
public InputOutputOperation() {
	keyboard=new Scanner(System.in);
}
	//1.get integers
	public void getData() {
		int num;
		System.out.println("Enter a integer");
		num=keyboard.nextInt();
System.out.println("Numberr is :"+num);	
	}
	//2. get strings
	public void getData(String message) {
		String str;
		System.out.println(message);
		str=keyboard.next();
	System.out.println("String is :"+str);	
	}
	//3. show integer
	public void showData(int num) {
		System.out.println("Number is :"+num);
		
	}
	//4. SHOW string
	public void showData(String str) {
	System.out.println("String is :"+str);
	
	}
	//5. show string and integer
	public void showData(String str,int num) {
	System.out.println("String is :"+str+ " and number is :" +num);	
	}
	
	//6.show integer and string
	public void showData(int num,String str) {
		System.out.println("Number is:"+num+" String is : "+str);
	}
	
}
