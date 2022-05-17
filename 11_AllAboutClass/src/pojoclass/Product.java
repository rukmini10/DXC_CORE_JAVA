/*
 * 1.create pojo class having info 
 productId
 productName
 productQuantity
 productPrice
 calcTotalPrice()
 display all data with lambda
 */


package pojoclass;

import java.io.Serializable;
import java.util.Objects;

public class Product implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int productId;
	 private String productName;
	 private int productQuantity;
	 private int productPrice;
	 private int calcTotalPrice;
	 
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
	public int getCalcTotalPrice() {
		return calcTotalPrice;
	}
	public void setCalcTotalPrice(int calcTotalPrice) {
		this.calcTotalPrice = productQuantity*productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int productId, String productName, int productQuantity, int productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.productPrice = productPrice;
		this.calcTotalPrice=productQuantity*productPrice;
	}
	@Override
	public String toString() {
		return "productId=" + productId + ", productName=" + productName + ", productQuantity="
				+ productQuantity + ", productPrice=" + productPrice+", calcTotalPrice="+calcTotalPrice;
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
	 
	
	
}
