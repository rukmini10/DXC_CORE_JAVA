//		Q3: java code to get cost price and sale price of an item and findout loss or profit / no loss no profit


package conditional;
import java.util.Scanner;
public class Q3 {

	public static void main(String args[]) 
    {   
	
           Scanner s= new Scanner(System.in);
           System.out.println("Enter Costprice ");
           double cp=s.nextDouble();
		   System.out.println("Enter Selling price:");
           double sp=s.nextDouble();
 
		   if(cp-sp>0)
           {
		     System.out.println("loss:" +(cp-sp));
	       	}
		    else if(cp-sp<0)
                {
		    System.out.println("profit:" +(sp-cp));
		   }
		    else if(sp==cp) {
		
		   System.out.println("No Profit and no loss");
		    }
          
   }

}
