package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ListDemo {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(111);
		list.add(456.6f);
		list.add("India");
		list.add(444567l);
		list.add(true);
		//1 display list content
		System.out.println(list);
		
		//2 display list content
		for(int i=0;i<list.size();i++)
			System.out.print(list.get(i)+" ");
		
		System.out.println();
		//3 display list content
		Iterator itr=list.iterator();
		for(;itr.hasNext();)
			System.out.print(itr.next()+" ");
	}

}
