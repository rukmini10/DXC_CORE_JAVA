package dxc.student.marksinfo;

import java.util.Scanner;

public class StudentMarksService {
public static void main(String[] args) {
	StudentMarks student=new StudentMarks();
	Scanner sc=new Scanner(System.in);
	int ch,num,k;
	try {
		
			System.out.println("1.Store Student Marks\n 2.Display Student Marks \n 3.Exit");
			System.out.print("Enter your choice");
			ch=sc.nextInt();
			System.out.println("-------------------------------");
			switch(ch) {
			case 1:
				System.out.println("How many records you want to store?");
			    num=sc.nextInt();
			    
			    System.out.println("Enter RollNumber: ");
			    int rollNo = sc.nextInt();
			    
			    System.out.println("Enter Semester: ");
			    String semester = sc.next();
			    
			    System.out.println("Enter marks in C programming: ");
			   float cProgramming = sc.nextFloat();
			   
			   System.out.println("Enter marks in Core Java: ");
			   float coreJava = sc.nextFloat();
			   
			   System.out.println("Enter marks in Advance Java: ");
			   float advanceJava = sc.nextFloat();
			 
			   System.out.println("Total Marks: ");
			   float totalMarks=cProgramming+coreJava+advanceJava;
			   totalMarks = sc.nextFloat();
			   
			   System.out.println("Inserted successfully");
			  
			   break; 
			
			
			
		   case 2:
		
		case 3:
					
			}
		}catch(Exception e) {
		System.out.println("Error");
	}
}}
	
		
		


