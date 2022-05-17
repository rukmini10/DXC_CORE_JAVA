package generic;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
//without generic-each time we need to typecast or pass restricted data type
public class Planner2 {
	public static void main(String[] args) {
	List <Integer>list=new LinkedList<Integer>();
	list.add(111);
	list.add(222);
	list.add(333);
	list.add(444);
	list.add(555);
	
	System.out.println(list);
	Iterator <Integer>itr=list.iterator();
	while(itr.hasNext()) {
	Integer i= itr.next();
		//	System.out.println(itr.next());
	}
	}
}

//======================================
/*


*/
