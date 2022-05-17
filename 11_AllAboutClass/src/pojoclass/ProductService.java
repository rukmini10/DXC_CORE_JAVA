package pojoclass;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> list=new ArrayList<Product>();
		list.add(new Product(1,"mike",5,100));
		list.add(new Product(2,"keyboard",1,500));
		list.add(new Product(3,"laptop",5,111100));
		
		
		list.forEach((c) -> System.out.println(c));
	//System.out.println(list);
		/*Product p=(productId,productName,productQuantity,productPrice,calcTotalPrice) -> 
		{
			System.out.println(list);
		};
	*/

	}

}
