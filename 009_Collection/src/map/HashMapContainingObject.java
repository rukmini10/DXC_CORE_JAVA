package map;

import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

class Item{
	private String itemName;
	private int itemQty;
	private double itemPrice;
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemQty() {
		return itemQty;
	}
	public void setItemQty(int itemQty) {
		this.itemQty = itemQty;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(String itemName, int itemQty, double itemPrice) {
		super();
		this.itemName = itemName;
		this.itemQty = itemQty;
		this.itemPrice = itemPrice;
	}
	@Override
	public String toString() {
		return "\n"+ itemName + ","+ itemQty +"," + itemPrice;
	}
	@Override
	public int hashCode() {
		return Objects.hash(itemName, itemPrice, itemQty);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return itemName == other.itemName
				&& Double.doubleToLongBits(itemPrice) == Double.doubleToLongBits(other.itemPrice)
				&& itemQty == other.itemQty;
	}
	
	
	
	
}
public class HashMapContainingObject {
public static void printHashMap(HashMap<Integer,Item> map) {
Set<Integer> keys=map.keySet();	
System.out.println(keys);
//enhance for loop
for(Integer i:keys) {
	System.out.println("\n "+i +"=>"+map.get(i));
}
}
	public static void main(String[] args) {
		HashMap<Integer,Item> map=new HashMap<Integer,Item>();
		map.put(11,new Item("Mouse",3,3700));
		map.put(22,new Item("Mic",4,700));
		map.put(33,new Item("Scanner",1,112700));
		map.put(44,new Item("Camera",3,32700));
		
		
		System.out.println(map);
	//	System.out.print("\n"+map.remove(33));
		
		printHashMap(map);
		
	
}
}


/*
write java code to create student class having rollNumber, name, marks as value
and rollno as key 
do some search operation-based on rollno whether object is found or not
*/




