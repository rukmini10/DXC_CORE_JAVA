//		Q4: java code to get unit of electricity consumed and find the electric bill based on following
/*- if units are less than 200 it is free
		     - if units are >200 and <=500, then have to pay 5.25 rupees per unit
		     - example- if 280 units 200 units are free and remaining 80 will be charges
		     - units are >500 and <=800, 8.50 per unit	
*/

package conditional;
import java.util.Scanner;
public class Q4 {

	public static double main(double units) {
		    {
		      
		        if (units < 200) {
		            return units * 0;
		        }
		        else if (units > 200 && units <= 500) {
		            return (200 * 0)
		                + (units -200 )
		                      * 5.25;
		        }
		        else if (units>500 && units <= 800) {
		            return (500 * 5.25)
		           
		                + (units - 500)
		                      * 8.50;
		        }
		       
		        return 0;
		    }}
		 
		  
		    public static void main(String args[])
		    {
		        int units = 600;
		 
		        System.out.println(
		            main(units));
		    }
		}
	


