package mypack;

public class PersonService {
	
public static void searchPersonByName(Person persons[],String fname) {
boolean status=false;
	for(int i=0;i<persons.length;i++) {
		if(persons[i].getFirstName().equals(fname)) {
		System.out.println("Data found:"+persons[i]);
		status=true;
		break;
	}
	}
if(status==false) {
	System.out.println(fname+"not found...");
}
}
public static void main(String[] args) {
	Person persons[];
	persons=new Person[5];
	//persons[0]=new Person("Chebrolu","Rukmini","9505918828");
	String fname,lname,contact;
	for(int i=0;i<5;i++) {
		fname="Chebrolu";
		lname="Rukmini";
		contact="9505918828";
		persons[i]=new Person(fname,lname,contact);
		System.out.println(persons[i]);
		
	
		}
	searchPersonByName(persons,"Chebrolu");
}
}
