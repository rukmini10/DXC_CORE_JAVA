package com.collection.shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class Products {
private final List<Product> products=new ArrayList<Product>();

public void initStoreItems() {
	String[] productName= {"Apple","Carrot","Soap","Choclates","Rice","Dals"};
	Double[] productPrice= {45d,25d,65d,45d,1000d,500d};
	Integer[] productQuantity= {10,20,30,5,1,2};
	
	for(int i=0;i<productName.length;i++) {
		this.products.add(new Product(i+1,productName[i],productQuantity[i],productPrice[i]));
		
	}
}
public Products() {
	this.initStoreItems();
}
public List<Product> getProducts(){
	return products;
}
}
