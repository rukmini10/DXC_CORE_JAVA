package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map <Integer,String>map=new HashMap<Integer,String>();
	map.put(111, "Rukmini");
	map.put(222, "Radhika");
map.put(444, "Tanishka");
	//	map.put(333, "Rakesh");
//	map.put(111, "Rajesh");
	System.out.println(map);
	
	Set keys=map.keySet();
	Iterator <Integer>itr=keys.iterator();
	int i;
	while(itr.hasNext()) {
		i=itr.next();
		System.out.print("\t"+i+"=>"+map.get(i));
	}
	map.remove(222);
	System.out.println("\n"+map);
	
	}
}
