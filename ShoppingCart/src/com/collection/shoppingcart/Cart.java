package com.collection.shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	List<Product> cartItems=new ArrayList<Product>();

	public void addToCartById(int productId) {
		Product product=getProductById(productId);
		addToCart(product);
	
}

	private void addToCart(Product product) {
		// TODO Auto-generated method stub
		cartItems.add(product);
		
	}

	private Product getProductById(int productId) {
		// TODO Auto-generated method stub
		Product product=null;
		List<Product> products=new Products().getProducts();
		for(Product productdata: products) {
			if(productdata.getProductId()==productId) {
				product=productdata;
				break;
			}
		}
		return product;
		
	}
	
	public void removeFromCart(int productId) {
		Product productdata=getProductById(productId);
		cartItems.remove(productdata);
	}
	void displayCartItems() {
		for(Product productdata:cartItems) {
			System.out.println(productdata.getProductName());
		}
	}
	
}
