package set;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;


public class HashSetDemo {
public static void main(String[] args) {
	Set set=new HashSet();
	set.add(11);
	set.add("India");
	set.add(null);
	set.add("India");
	System.out.println("Set data are: "+set);
	
	//display data using iterator
	Iterator itr=set.iterator();
	while(itr.hasNext()) {
		System.out.println("\n"+itr.next());
	}
}
}
