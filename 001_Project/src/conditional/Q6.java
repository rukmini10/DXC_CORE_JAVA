/*Calculator
 *	Q. java code to create a menu driven program which will ask choice based on choice 
	do some calculation
	
	calculator
1.Add
2.Sub
3.Mul
4.Div
5.exit

Enter you choice(1-5):
1
enter first number:12
enter second number:13
sum is 25
Enter you choice(1-5):
5
  
 */


package conditional;

import java.util.Scanner;

public class Q6 {

	public static int add(int num1,int num2) {
		
	return(num1+num2);

	}
	public static int sub(int num1,int num2) {
		
		return(num1-num2);

		}

	public static int mul(int num1,int num2) {
		
		return(num1*num2);

		}

	public static int div(int num1,int num2) {
		
		return(num1/num2);

		}
public static void main(String[] args) {
	int choice,num1,num2;

	//double result=add(34,33);
	//System.out.println("Result :"+result);
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter your choice from the following menu:");
	 System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division 5.Exit");
	 choice = sc.nextInt();
	 if(choice!=5){
	 System.out.println("Enter the first number");
	 num1=sc.nextInt();
	 System.out.println("Enter the second number");
	 num2=sc.nextInt();
	 
	 switch(choice)
	 {
	 case 1:System.out.println("Addition of "+num1+" and "+num2+" is "+add(num1,num2));
	 break;
	 case 2:System.out.println("Subtraction of "+num1+" and "+num2+" is "+sub(num1,num2));
	 break;
	 case 3:System.out.println("Addition of "+num1+" and "+num2+" is "+mul(num1,num2));
	 break;
	 case 4: if(num2==0)
	 System.out.println("Error!!! In Division denominator cannot be 0!");
	 else{
	 System.out.println("division of "+num1+" by "+num2+" quotient is "+div(num1,num2));} 
	 break;
	 case 5: 
		 break;
	 default: System.out.println("Invalid choice");
	 }
	 
	 }


}
}
