package streamapi;

import java.util.Arrays;
import java.util.List;

public class PersonServiceInOldWays {

	
	public static void main(String[] args) {
		List<Person> persons=Arrays.asList(new Person("Fatima","Mangolore","464545645"),
				new Person("Rukmini","Vijayawada","464545645"),
				new Person("Isvariya","Mangolore","8555545645"),
				new Person("Keerthi","Mangolore","464545645"),
				new Person("PK","Mangolore","464545645")
				);
		System.out.println(persons);
		for(int i=0;i<persons.size();i++) {
			System.out.print("\n"+persons.get(i).getFirstName());
		}
	}
	
}
