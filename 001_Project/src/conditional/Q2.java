//		Q2: java code to get any 3 numbers and find difference between biggest and smallest number



package conditional;
import java.util.Scanner;
public class Q2 {

	public static void main(String args[])  {
		int largest,smallest;
		 Scanner scanner = new Scanner(System.in);
	      
	 
	        System.out.println("Please enter first number :");
	        int  first = scanner.nextInt();
	 
	        System.out.println("Please enter second number :");
	         int  second = scanner.nextInt();
	 
	        System.out.println("Please enter third number :");
	        int  third = scanner.nextInt();
	 
	        largest = largest(first, second, third);
	        smallest = smallest(first, second, third);
	 
	        System.out.printf("largest of three numbers %d, %d, and %d is : %d %n",
	                                   first, second, third, largest);
	        System.out.printf("smallest of three numbers %d, %d, and %d is : %d %n", 
	                               first, second, third, smallest);
	        int difference;
	        difference=largest-smallest;
	        System.out.printf("Difference of largest and smallest is %d",difference);

	}

	 public static int largest(int first, int second, int third) {
	        int max = first;
	        if (second > max) {
	            max = second;
	        }
	 
	        if (third > max) {
	            max = third;
	        }
	 
	        return max;
	    }

	 public static int smallest(int first, int second, int third) {
	        int min = first;
	        if (second < min) {
	            min = second;
	        }
	 
	        if (third < min) {
	            min = third;
	        }
	 
	        return min;
	    }
	 
	}
	 

	


