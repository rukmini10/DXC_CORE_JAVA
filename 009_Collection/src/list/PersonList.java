package list;

import java.util.ArrayList;
import java.util.List;

public class PersonList {
	public static void main(String args[]) {
		List <Person>personList=new ArrayList<Person>();
		personList.add(new Person("Sanjay","Kumar","9818254421",38));
		personList.add(new Person("San","Kumar","9818254421",38));
		personList.add(new Person("jay","Kumar","9818254421",38));
		personList.add(new Person("Sanju","Kumar","9818254421",38));
		System.out.println(personList);
		System.out.println("Size of list:"+personList.size());
		personList.add(2,new Person("Kakumani","Singh","2544219818",83));
		System.out.println("Size of list:"+personList.size());		
		System.out.println(personList);
		personList.remove(4);
		System.out.println(personList);
		Object arr[]=personList.toArray();
		
		System.out.println();
		//printing object arr content
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]);
		
		String name="Rukmini";
		Person person=null;
		for(int i=0;i<personList.size();i++) {
			if(personList.get(i).getFirstName().equals(name)) {
				person=personList.get(i);
				break;
			}
		}
		if(person==null) {
			System.err.println("\nRecord not found for "+name+":");
		}else {
			System.out.println("\nRecord found for "+name+":"+person);
		}
		personList.clear();
		System.out.println(personList);
	}

}
/*
 * 1. adding person at first position
 * 2. adding person at last
 * 3. remove person by object
 * 4. remove person by index
 * 5. remove all persons
 * 6. display all persons
 * 7. display person data  by first name
 */


