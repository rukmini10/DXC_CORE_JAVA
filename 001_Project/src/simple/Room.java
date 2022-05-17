/*Q1. Write a Java class that declares variables to represent the length and width of a room in feet. Assign appropriate values to 
the variables-for example, length = 15 and width = 25. Compute and display the floor space of the room in square feet 
(area = length * width). Display explanatory text with the value—for example, The floor space is 375 square feet. Save the class 
as Room.java.
*/


package simple;
import java.util.Scanner;
/*
I=>input(take value from user)
P=>processing based on input or operator given
O=>output
*/

/*Data types-
 * byte -1byte
 * char -2
 * int -4
 * long -8 
 * float 
 * double
 * boolean
 * 
 */
//Method 1
/*
public class Room {

	public static void main(String[] args) {
		
	float length=23.5f;
	float breadth=45.7f;		
	double area=length*breadth;
	System.out.println(area);

	}

}

*/

//Method 2 Take input from user

public class Room {

	public static void main(String[] args) {
		
	float length,breadth;	
	Scanner keyboard=new Scanner(System.in);
	System.out.println("Enter value for length");
	length=keyboard.nextInt();
	System.out.println("Enter value for breadth");
	breadth=keyboard.nextInt();	
	double area=length*breadth;
	System.out.println("The floor space is "+area+"square feet");
	

	}

}
