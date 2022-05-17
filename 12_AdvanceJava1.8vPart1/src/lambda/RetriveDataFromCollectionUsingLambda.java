package lambda;

import java.util.ArrayList;
import java.util.List;

public class RetriveDataFromCollectionUsingLambda {

	public static void main(String[] args) {
		List<String> studentLeads=new ArrayList<String>();
		studentLeads.add("Isvariyashree");
		studentLeads.add("Rukmini");
		studentLeads.add("Keerthi");
		studentLeads.add("Srinika");
		studentLeads.add("Pavan kalyan");
		studentLeads.add("Nikhila");
	/*
		for(int i=0;i<studentLeads.size();i++) {
			System.out.println(studentLeads.get(i));
		}
		*/
		//or
		studentLeads.forEach(
				(names) -> System.out.println(names)
				);
		
		
	}

}
