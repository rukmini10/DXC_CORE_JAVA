
//		Q1: java code to get age of two trainees and find out who is elder


package conditional;

import java.util.Scanner;

public class Q1 {

	 public static void main(String[] args) {
	       
	        
	     int  Trainee1,Trainee2;
	            
	     
	        Scanner keyboard = new Scanner(System.in);
	        System.out.println("Enter Trainee1:");
	        Trainee1 = keyboard.nextInt();
	        System.out.println("Enter Trainee2 Age:");
	        Trainee2 = keyboard.nextInt();
	       
	        
	        
	        if (Trainee1 > Trainee2) {
	        System.out.println("Trainee1 is the Oldest");
	        }
	        else {
	        System.out.println("Trainee2 is the Oldest");
	        }
	            
	   }
	}




