package apex.hospital;
import java.util.Scanner;

public class Doctor {

	int doctor_id;
	String doctor_name;
	String doctor_specialist;
	String doctor_contact;
	String doctor_education;
	void addDoctor() {
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter Doctors Id: ");
		doctor_id=sc.nextInt();
		System.out.println("Enter Doctors Name: ");
		doctor_name=sc1.nextLine();
		System.out.println("Enter Doctors Specialisation: ");
		doctor_specialist=sc1.nextLine();
		System.out.println("Enter Doctors Contact Number: ");
		doctor_contact=sc1.nextLine();
		System.out.println("Enter Doctors Education: ");
		doctor_education=sc1.nextLine();
			
	}
	
	public void displayDoctor() {
		System.out.println(doctor_id + "\t\t" + doctor_name + " \t \t" + doctor_specialist + "    \t \t" + doctor_contact + " \t   \t" + doctor_education);

	}

	public void addNurse() {
		// TODO Auto-generated method stub
		
	}

	public void addHelpingStaff() {
		// TODO Auto-generated method stub
		
	}
}
