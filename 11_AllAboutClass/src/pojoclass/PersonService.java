package pojoclass;

import java.util.ArrayList;
import java.util.List;

public class PersonService {

	public static void main(String[] args) {
		List<Person> list=new ArrayList<Person>();
		list.add(new Person("Rukmini","9505918828"));
		list.add(new Person("Keerthi","4444918828"));
		list.add(new Person("Prasana","95054441118"));
		list.add(new Person("Harish","48115441828"));
		for(Person p:list) {
			System.out.print(p);
		}
		
	}

}
