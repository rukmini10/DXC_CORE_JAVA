import java.util.Hashtable;
import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	Hashtable<String,String> hash=new Hashtable<String,String>();
	System.out.println("Enter Product Id and Product Name: ");
	
	
	for(int i=0;i<10;i++) {
		hash.put(sc.next(), sc.next());
	}
	System.out.println("Product List is : ");
	System.out.println(hash);
	
	System.out.println("\nEnter Product Id you want to remove");
String id=sc.next();
hash.remove(id);
System.out.println("Item removed successfully...");

System.out.println("Product List is....");
System.out.println(hash.toString());
System.out.println("Enter Product ID you want to search :");
	String searchId=sc.next();
	if(hash.containsKey(searchId))
		System.out.println(hash.get(searchId));
	else
		System.out.println("Not found");
	
	}

}
