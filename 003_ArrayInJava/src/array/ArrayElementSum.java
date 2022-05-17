package array;
import java.util.Scanner;

public class ArrayElementSum {

	public static void main(String[] args) {
	Scanner keyboard=new Scanner(System.in);
	int num[],size,sum=0;
	System.out.println("Enter size of array: ");
	size=keyboard.nextInt();
	num=new int[size];
	for(int i=0;i<num.length;i++) {
		System.out.println("Enter Num"+(i+1)+":");
		num[i]=keyboard.nextInt();
	}
	//displaying array elements and finding sum
	for(int i=0;i<num.length;i++) {
		System.out.print(num[i]+"\t");
		sum=sum+num[i];
		
	}
	System.out.print("\nSum is :"+sum);
	}

}
/*
//write java code to get n elements from user and find out sum of even and sum of odd number
1,2,3,4,5,6
sum of even =2+4+6
sum of odd=1+3+5
*/