package set;
import java.util.TreeSet;
public class TreeSetDemo {
public static void main(String[] args) {
	TreeSet <Integer>tree=new TreeSet<Integer>();
	tree.add(111);
	tree.add(222);
	tree.add(333);
	tree.add(444);
	System.out.println(tree);
	
	//to remove an object
	System.out.println("\n"+tree.pollFirst()+" is removed from tree set");
	System.out.println("\n"+tree.pollLast()+" is removed from tree set");

	System.out.println(tree);
}
}
