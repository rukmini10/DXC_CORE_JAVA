package functioninterface;

import java.util.Objects;

public class Product {
	private int productId;
	private String productName;
	private int productQuantity;
	private int productPrice;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	
	
	
	public Product(int productId, String productName, int productQuantity, int productPrice) {

		this.productId = productId;
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.productPrice = productPrice;
	}
	
	@Override
	public String toString() {
		return "ProductId= " + productId + ", Product Name= " + productName + ", Product Quantity= "
				+ productQuantity + ", Product Price= " + productPrice + " ,Total Price " + calcTotal();
	}
	@Override
	public int hashCode() {
		return Objects.hash(productId, productName, productPrice, productQuantity);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return productId == other.productId && Objects.equals(productName, other.productName)
				&& productPrice == other.productPrice && productQuantity == other.productQuantity;
	}
	public int calcTotal() {
		int totalPrice = this.productPrice*this.productQuantity;
		return (totalPrice);
	}
	
	
	

}