package apex.hospital;

import java.util.Scanner;

public class HelpingStaff {
	
	Scanner key = new Scanner(System.in);
	Scanner key1=new Scanner(System.in);
	int serialNumber;
	String staffName;
	String staffQualification;
	String staffContactNumber;
	
	
	
	void addHelpingStaff() {
		
		System.out.println("Enter Serial Number");
		serialNumber= key.nextInt();
		System.out.println("Enter your Name");
		staffName = key1.next();
		System.out.println("Enter your Qualification ");
		staffQualification = key1.next();
		System.out.println("Enter your Contact Number");
		staffContactNumber = key1.next();
		
	}
	
	void displayHelpingStaff() {
		System.out.println("APEX00" + serialNumber +"\t" +  staffName +"\t"+ staffQualification+"\t" + staffContactNumber);
	}
	
	void add_Medicine_Bill() {
		int count;
		String medicineName;
		int medicinePrice ;
		int totalPrice = 0, temp = 0;
		System.out.println("Enter the number of Medicines Prescribed : ");
		count = key.nextInt();
		for(int i = 0; i<count; i++) {
			System.out.println("Enter the Medicine and its price : ");
			medicineName = key.next();

			medicinePrice = key.nextInt();
			totalPrice = temp + medicinePrice;
			temp = totalPrice;
			}
		System.out.println("Total Medicine bill to be paid : " +totalPrice);
	}
		
		
	
	
	void add_Hospital_Bill() {
	    int admissionFee = 250;
	    int doctorConsultancyFee = 150;
	    int firstAidFee;
	    int bloodTestFee;
	    int scanFee;
	    double GST;
	    double totalPrice;
	    System.out.println("Admit fee : "+admissionFee);
	    System.out.println("Admit fee : "+doctorConsultancyFee);
	  
	    System.out.println("First Aid fee : ");
	    firstAidFee = key.nextInt();
	    System.out.println("Blood Test Fee : ");
	    bloodTestFee = key.nextInt();
	    System.out.println("Scan Fee : ");
	    scanFee = key.nextInt();
	   
	    GST = (admissionFee  +doctorConsultancyFee+ firstAidFee +bloodTestFee+scanFee) * 0.1/2;
	    totalPrice = admissionFee  +doctorConsultancyFee+ firstAidFee +bloodTestFee+scanFee + GST;
	    System.out.println("Total Amount to be paid : " + totalPrice);
	    
		

	}

}
