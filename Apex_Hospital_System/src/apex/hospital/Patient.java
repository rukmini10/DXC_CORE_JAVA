package apex.hospital;
import java.util.Scanner;
public class Patient {
public int patientId;
public int patientAge;
public String patientName;
	public String patientGender;
	public String symptoms;
	public String contactNo;
	public String address;
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getPatientAge() {
		return patientAge;
	}
	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientGender() {
		return patientGender;
	}
	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Patient() {
		super();
		
	}
	public Patient(  int patientId, String patientName,int patientAge, String patientGender, String symptoms,
			String contactNo, String address) {
		super();
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.patientId = patientId;
		this.patientGender = patientGender;
		this.symptoms = symptoms;
		this.contactNo = contactNo;
		this.address = address;
	}
	@Override
	public String toString() {
		return "patientId=" + patientId + ", patientName=" + patientName + ", patientAge=" + patientAge
				+ ", patientGender=" + patientGender + ", symptoms=" + symptoms + ", contactNo=" + contactNo
				+ ", address=" + address;
	}
	
void addPatient() {
	Scanner sc=new Scanner(System.in);
	Scanner sc1=new Scanner(System.in);
	Scanner sc2=new Scanner(System.in);
	System.out.println("Enter Patient Id: ");
	patientId=sc.nextInt();
	System.out.println("Enter Patient Age: ");
	patientAge=sc.nextInt();
	System.out.println("Enter Patient Name: ");
	patientName=sc1.nextLine();
	System.out.println("Enter Patient Gender: ");
	patientGender=sc1.nextLine();
	System.out.println("Enter Patient Symptoms: ");
	symptoms=sc1.nextLine();
	System.out.println("Enter Patient Contact Number: ");
	contactNo=sc1.nextLine();
	System.out.println("Enter Patient Adress: ");
	address=sc1.nextLine();
}

void displayPatient() {
	
	System.out.println(patientId + "\t\t" +  patientName+ "\t\t" + patientAge + "\t\t" + patientGender+ "\t\t" +symptoms+ "\t\t" + contactNo + "\t\t" + address);
}
	
}
