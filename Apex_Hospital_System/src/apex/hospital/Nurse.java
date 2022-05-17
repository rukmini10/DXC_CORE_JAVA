package apex.hospital;

import java.util.Scanner;
public class Nurse {
   
	int nurse_id;
	String nurse_name;
	String nurse_contact;
	String nurse_education;
	String nurse_location;
	void addNurse() {
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter Nurse Id: ");
		nurse_id=sc.nextInt();
		System.out.println("Enter Nurse Name: ");
		nurse_name=sc1.nextLine();
		System.out.println("Enter nurse Contact Number: ");
		nurse_contact=sc1.nextLine();
		System.out.println("Enter nurse Education: ");
		nurse_education=sc1.nextLine();
		System.out.println("Enter nurse Location: ");
		nurse_location=sc1.nextLine();
			
	}
	
	public void displayNurse() {
		System.out.println(nurse_id + "\t\t" + nurse_name + " \t \t" + "    \t \t" + nurse_contact + " \t   \t" + nurse_education+"\t \t"+nurse_location);

	}
public void assignDoctor() {
	
}

}