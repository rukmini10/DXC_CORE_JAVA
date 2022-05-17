package functioninterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductService {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(1, "Speaker" , 1, 650));
		list.add(new Product(2, "headset" , 2, 6500));
		list.add(new Product(3, "Mic" , 2, 500));
		//Displaying content normal
		list.forEach(
				(info) -> System.out.println(info));
		//Display content sort by product name
		Collections.sort(list,(p1,p2) -> {return p1.getProductName().compareTo(p2.getProductName());});
		for(Product p:list){  
            System.out.print("\n"+p);  
        } 
	}
	
}
