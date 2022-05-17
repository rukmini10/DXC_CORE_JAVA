package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class PersonServiceInModernWays {

	public static void main(String[] args) {
		List<Person> persons=Arrays.asList(new Person("Fatima","Mangolore","464545645"),
				new Person("Rukmini","Vijayawada","464545645"),
				new Person("Isvariya","Mangolore","8555545645"),
				new Person("Keerthi","Mangolore","464545645"),
				new Person("PK","Mangolore","464545645")
				);
		List<String> list=persons.stream().map(Person::getFirstName).collect(Collectors.toList());
	System.out.println(list);
	
	
	Set<String> set=persons.stream()
			.map(Person::getFirstName)
			.collect(Collectors.toCollection(TreeSet::new));
	System.out.println(set);
	}
	
	
}
