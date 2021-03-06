


import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Iterator;

public class StudentService {
	public static void main(String[] args) {
	      
	      List<Student> student = new ArrayList<Student>();
	      Scanner input1 = new Scanner(System.in);
	      Scanner input2 = new Scanner(System.in);
	      int choice;
	      do{
	         System.out.println("1.INSERT");
	         System.out.println("2.DISPLAY");
	         System.out.println("3.SEARCH");
	         System.out.println("4.DELETE");
	         System.out.println("5.UPDATE");
	         System.out.println("0.EXIT");
	         System.out.print("Enter Your Choice : ");
	         choice = input1.nextInt();

	         switch(choice){
	            case 1:
	               System.out.print("Enter Student RollNo : ");
	               int roll = input1.nextInt();
	               System.out.print("Enter Student Name : ");
	               String name = input2.nextLine();
	               System.out.print("Enter Student Age : ");
	               int age = input1.nextInt();
	               System.out.print("Enter Student course : ");
	               String course = input2.nextLine();
	              
	              
	               

	               student.add(new Student(roll,name,age,course));
	            break;
	            case 2:
	               System.out.println("****************************************");
	               Iterator<Student> i = student.iterator();
	               while(i.hasNext()){
	                  Student s = i.next(); 
	                  System.out.println(s);
	               }
	               System.out.println("****************************************");
	            break;
	            case 3:
	               boolean found = false;
	               System.out.print("Enter Student RollNo to Search :");
	               int roll_no = input1.nextInt();
	               System.out.println("****************************************");
	               i = student.iterator();
	               while(i.hasNext()){
	                  Student s = i.next();
	                  if(s.getRoll_no() == roll_no)  {
	                     System.out.println(s);
	                     found = true;
	                  }
	               }
	               
	               if(!found){
	                  System.out.println("Record Not Found");
	               }
	               System.out.println("****************************************");
	            break;

	            case 4:
	               found = false;
	               System.out.print("Enter Student RollNo you want to  Delete :");
	               roll_no = input1.nextInt();
	               System.out.println("****************************************");
	               i = student.iterator();
	               while(i.hasNext()){
	                  Student s = i.next();
	                  if(s.getRoll_no() == roll_no)  {
	                     i.remove();
	                     found = true;
	                  }
	               }
	               
	               if(!found){
	                  System.out.println("Record Not Found");
	               }else{
	                  System.out.println("Record is Deleted Successfully...!");
	               }

	               System.out.println("----------------------------");
	            break;
	            case 5:
	               found = false;
	               System.out.print("Enter RollNo to Update :");
	               roll_no = input1.nextInt();
	               
	               ListIterator<Student>li = student.listIterator();
	               while(li.hasNext()){
	                  Student s = li.next();
	                  if(s.getRoll_no() == roll_no)  {
	                     System.out.print("Enter new Name : ");
	                     name = input2.nextLine();

	                     System.out.print("Enter new Age: ");
	                     age = input1.nextInt();
	                     
	                     System.out.print("Enter new course : ");
	                     course = input2.nextLine();

	                    
	                     
	                     li.set(new Student(roll_no,name,age,course));
	                     found = true;
	                  }
	               }
	               
	               if(!found){
	                  System.out.println("Record Not Found");
	               }else{
	                  System.out.println("Record is Updated Successfully...!");
	               }

	               
	            break;
	            case 0:
	            	 System.out.println("Thank you Exited successfully");
	            

	            
	         }
	      }while(choice!=0);
	   }
	

}

