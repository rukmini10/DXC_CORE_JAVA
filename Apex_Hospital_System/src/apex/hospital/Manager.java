package apex.hospital;
import java.io.*;
import java.util.*;
import java.util.Calendar;

public class Manager{
	public static void main(String args[]){  

		int doctor_count = 4, nurse_count = 4, staff_count = 4, patient_count = 4;

		System.out.println("Hello Welcome to the Apex Hospital Management");
		System.out.println("----------------------------------------------");
		int i;

		Doctor[] doctor = new Doctor[30];
		for (i = 0; i < 30; i++)
			doctor[i] = new Doctor();

		doctor[0].doctor_id = 1;
		doctor[0].doctor_name = "Karuna";
		doctor[0].doctor_specialist = "Heart";
		doctor[0].doctor_contact = "9505918828";
		doctor[0].doctor_education = "MBBS, MS";

		doctor[1].doctor_id = 2;
		doctor[1].doctor_name = "Radha";
		doctor[1].doctor_specialist = "Neurialogist";
		doctor[1].doctor_contact = "95045574258";
		doctor[1].doctor_education = "MBBS, MS";

		doctor[2].doctor_id = 3;
		doctor[2].doctor_name = "Srinivas";
		doctor[2].doctor_specialist = "ENT";
		doctor[2].doctor_contact = "45845478954";
		doctor[2].doctor_education = "MBBS";

		doctor[3].doctor_id = 4;
		doctor[3].doctor_name = "Srinivas";
		doctor[3].doctor_specialist = "Dentist";
		doctor[3].doctor_contact = "45845478954";
		doctor[3].doctor_education = "MBBS";

		Nurse[] nurse = new Nurse[15];
		for (i = 0; i < 15; i++)
			nurse[i] = new Nurse();

		nurse[0].nurse_id = 1;
		nurse[0].nurse_name = "Hema";
		nurse[0].nurse_contact = "4561479512";
		nurse[0].nurse_education = "BSN";
		nurse[0].nurse_location="Andhra pradesh";

		nurse[1].nurse_id = 2;
		nurse[1].nurse_name = "Meghana";
		nurse[1].nurse_contact = "41247789512";
		nurse[1].nurse_education = "Nursing";
		nurse[1].nurse_location="Madhya pradesh";

		nurse[2].nurse_id = 3;
		nurse[2].nurse_name = "Ramya";
		nurse[2].nurse_contact = "457127879512";
		nurse[2].nurse_education = "Nursing";
		nurse[2].nurse_location="Mumbai";

		nurse[3].nurse_id = 4;
		nurse[3].nurse_name = "Vyshnavi";
		nurse[3].nurse_contact = "4567879512";
		nurse[3].nurse_education = "Nursing";
		nurse[3].nurse_location="Himachal Pradesh";

		Patient[] patient = new Patient[100]; 
		for (i = 0; i < 100; i++)
			patient[i] = new Patient();

		patient[0].patientId = 1;
		patient[0].patientName = "Syndra ";
		patient[0].patientAge=45;
		patient[0].patientGender = "Female";
		patient[0].symptoms = "Cought, Cold";
		patient[0].contactNo = "4514584598";
		patient[0].address="Nepal";

		patient[1].patientId = 2;
		patient[1].patientName = "Mahima";
		patient[1].patientAge=35;
		patient[1].patientGender = "Male";
		patient[1].symptoms = "Head Ache, Cold";
		patient[1].contactNo = "4514584598";
		patient[1].address="Bhopal";

		patient[2].patientId = 3;
		patient[2].patientName = "Subash";
		patient[2].patientAge=55;
		patient[2].patientGender = "Male";
		patient[2].symptoms = "Body pains, headache";
		patient[2].contactNo = "7845944598";
		patient[2].address="Himachal Pradesh";

		patient[3].patientId = 4;
		patient[3].patientName = "Suhasini";
		patient[3].patientAge=25;
		patient[3].patientGender = "female";
		patient[3].symptoms = "headache";
		patient[3].contactNo = "8457944598";
		patient[3].address="Bhubaneswar";

		HelpingStaff[] staff = new HelpingStaff[10];
		for (i = 0; i < 10; i++)
			staff[i] = new HelpingStaff(); 
		staff[0].serialNumber = 1;
		staff[0].staffName = "Pradeep";
		staff[0].staffQualification = "Bsc";
		staff[0].staffContactNumber = "4587459851";

		staff[1].serialNumber = 2;
		staff[1].staffName = "Dhruv";
		staff[1].staffQualification = "Msc";
		staff[1].staffContactNumber = "4571257851";

		staff[2].serialNumber = 3;
		staff[2].staffName = "Lohith";
		staff[2].staffQualification = "Bsc";
		staff[2].staffContactNumber = "9874459851";

		staff[3].serialNumber = 4;
		staff[3].staffName = "Mahima";
		staff[3].staffQualification = "Bsc";
		staff[3].staffContactNumber = "4545879851";

		Scanner input = new Scanner(System.in);

		int outer_choice;
		int j;
		int inner_choice;
		int status = 1;
		while (status == 1)

		{
			System.out.println("\nWho Are You !!! Choose Accordingly");
			System.out.println("-------------------------------------");
			System.out.println("1.Manager \n 2. Doctor \n 3. Nurses \n 4. Helping Staff \n 5. Patients \n 6. Exit ");

			outer_choice = input.nextInt();
			switch (outer_choice)

			{
			case 1:

			{
				System.out.println("\nHello, Manager !!!");
				System.out.println("-------------------------");
				System.out.println("1. Add New Doctors Data \n2. Add Nurses Data \n 3. Add New Helping Data \n4.View Doctors Data \n 5.View Nurses Data \n 6. View Helping Staff Data \n 7. View Patients Data");
				inner_choice=input.nextInt();
				switch (inner_choice)

				{
				case 1:
				{
					doctor[doctor_count].addDoctor();
					doctor_count++;
					break;
				}                         
				case 2:
				{
					nurse[nurse_count].addNurse();
					nurse_count++;
					break;
				}    

				case 3:
				{
					staff[staff_count].addHelpingStaff();
					staff_count++;
					break;
				}
				case 4:
				{
					System.out.println("--------------------------------------------------------------------------------");
					System.out.println("Doctor ID \t Doctor Name \t Doctor Specialist \t Doctor Contact No \t Doctor Education");
					for (j = 0; j < doctor_count; j++) {
						doctor[j].displayDoctor();
					}


					break;
				}

				case 5:
				{
					System.out.println("--------------------------------------------------------------------------------");
					System.out.println("Nurse Id \tNurse Name \tNurse ContactNo \tNurse Qualification \tNurse Location");
					for (j = 0; j < nurse_count; j++) {
						nurse[j].displayNurse();
					}
					break;
				}
				case 6:
				{
					System.out.println("--------------------------------------------------------------------------------");
					System.out.println("Staff Id \tStaff Name \tStaff Qualification \tStaff Contact");

					for (j = 0; j < staff_count; j++) {
						staff[j].displayHelpingStaff();
					}
					break;
				}

				case 7:
				{
					System.out.println("--------------------------------------------------------------------------------");
					System.out.println("Patient Id \tPatient Name \tPatient Age \tPatient Gender \tSymptoms \t Contact No\t Address");    
					for (j = 0; j < patient_count; j++) {
						patient[j].displayPatient();
					}
					break;
				}


				}
				System.out.println("\nPress 1 to go for Main Menu");
				inner_choice = input.nextInt();
			}
			break;


			case 2:

			{
				System.out.println("\nHello, Doctor !!!");
				System.out.println("-------------------------");

				System.out.println("1.Add New Patients Data \n2.View Existing Doctors Data \n3. View Existing Nurses Data \n4. View Existing Helping Staff Data");
				outer_choice = input.nextInt();
				switch (outer_choice)
				{
				case 1:
				{
					patient[patient_count].addPatient();
					patient_count++;
					break;
				}

				case 2:
				{
					System.out.println("--------------------------------------------------------------------------------");
					System.out.println("Doctor ID \t Doctor Name \t Doctor Specialist \t Doctor Contact No \t Doctor Education");
					for (j = 0; j < doctor_count; j++) {
						doctor[j].displayDoctor();
					}


					break;
				}
				case 3:
				{
					System.out.println("--------------------------------------------------------------------------------");
					System.out.println("Nurse Id \tNurse Name \tNurse ContactNo \tNurse Qualification \tNurse Location");
					for (j = 0; j < nurse_count; j++) {
						nurse[j].displayNurse();
					}
					break;
				}
				case 4:
				{
					System.out.println("--------------------------------------------------------------------------------");
					System.out.println("Staff Id \tStaff Name \tStaff Qualification \tStaff Contact");

					for (j = 0; j < staff_count; j++) {
						staff[j].displayHelpingStaff();
					}
					break;
				}
				}

				System.out.println("\nPress 1 to go for Main Menu");
				inner_choice = input.nextInt();
			}
			break;


			case 3:
			{

				System.out.println("\nHello, Nurses !!!");
				System.out.println("-------------------------");

				System.out.println("1.Add New Patients Data \n2. View Existing Nurses Data");
				outer_choice = input.nextInt();

				switch (outer_choice)
				{

				case 1:
				{
					patient[patient_count].addPatient();
					patient_count++;
					break;
				}

				case 2:
				{
					System.out.println("--------------------------------------------------------------------------------");
					System.out.println("Nurse Id \tNurse Name \tNurse ContactNo \tNurse Qualification \tNurse Location");

					for (j = 0; j < staff_count; j++) {
						nurse[j].displayNurse();
					}
					break;
				}

				}
				System.out.println("\nPress 1 to go for Main Menu");
				inner_choice = input.nextInt();
			}
			break;


			case 4:

			{

				System.out.println("\nHello, Helping Staff !!!");
				System.out.println("-------------------------");

				System.out.println("1.View Staff Data \n 2. Add and Get Medicine Bill \n 3. Add and Get Hospital Bill");
				outer_choice = input.nextInt();

				switch (outer_choice)

				{

				case 1:

				{
					System.out.println("-------------------------------------------------------------");
					System.out.println("Staff Id \tStaff Name \tStaff Qualification \tStaff Contact");
					for (j = 0; j < staff_count; j++) {
						staff[j].displayHelpingStaff();
					}
					break;
				}

				case 2:
				{
					staff[staff_count].add_Medicine_Bill();
					staff_count++;
					break;
				}
				case 3:
				{
					staff[staff_count].add_Hospital_Bill();staff_count++;
					break;
				}

				}

				System.out.println("\nPress 1 to go for Main Menu");
				inner_choice = input.nextInt();
			}
			break;


			case 5:
			{


				System.out.println("\nHello, Patients !!!");
				System.out.println("-------------------------");

				System.out.println("1.View Patients Data");
				outer_choice = input.nextInt();

				switch (outer_choice)
				{
				case 1:
				{
					System.out.println("--------------------------------------------------------------------------------");
					System.out.println("Patient Id \tPatient Name \tPatient Age \tPatient Gender \tSymptoms \t Contact No\t Address");    
					for (j = 0; j < patient_count; j++) {
						patient[j].displayPatient();
					}
					break;
				}
				}
				System.out.println("\n Press 1 to go for Main Menu");
				input.nextInt();
			}
			break;

			case 6:
			{
				System.out.println(" Thank you for you valuble time......");
			}

			System.out.println("\nReturn to MAIN MENU Press 1");
			status = input.nextInt();

			}


		}
	}


}