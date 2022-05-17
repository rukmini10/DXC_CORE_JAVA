package methodoverloading;
import java.util.Scanner;
public class UserChoice {
	static boolean isDivisibleBy7(int num)
    {
               if( num < 0 )
            return isDivisibleBy7( -num );
  
        if( num == 0 || num == 7 )
            return true;
        if( num < 10 )
            return false;
  
        return isDivisibleBy7( num / 10 - 2 * ( num - num / 10 * 10 ) );
    }
	public static void main(String argvs[])
	 {
	         int choice; 
	         Scanner sc = new Scanner(System.in); 
	          System.out.println("1: Any Table");
	          System.out.println("2: Even or Odd");
	          System.out.println("3: Divisible by 7");
	          System.out.println("4: Program termination");
	         while(true) 
	         {
	             System.out.print("Make your choice: ");  
	             choice = sc.nextInt(); 
	            lp:  switch (choice)
	              {
	                case 1:
	                    Scanner s = new Scanner(System.in);
	                	System.out.print("Enter number:");        
	                	int n=s.nextInt();
	                        for(int i=1; i <= 10; i++)
	                        {
	                            System.out.println(n+" * "+i+" = "+n*i);
	                        }
	                 break;
	                 
	                case 2:
	                	Scanner input = new Scanner(System.in);
	                    int num;  
	                    System.out.println("Enter a number:");
	                    num = input.nextInt();
	                    if ( num % 2 == 0 )
	                        System.out.println("The entered number is even");
	                     else
	                        System.out.println("The entered number is odd");
	                 
	                case 3:
	                	int number = 616;
	                    if(isDivisibleBy7(number))
	                        System.out.println("Divisible");
	                    else
	                        System.out.println("Not Divisible");
	                case 4:
	                	 break lp;
	                default:
	                 System.out.println("Invalid choice! Please make a valid choice. \n\n");
	               }
	             }
	 }
}
