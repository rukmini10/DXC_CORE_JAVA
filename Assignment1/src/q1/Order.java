package q1;
public class Order 
{
	private String CustomerName;
	private int CustomerNumber;
	private int QuantityOrdered;
	private double UnitPrice;
	protected double TotalPrice;
	

	public void setCustomerNumber(int num)
	{
		CustomerNumber=num;
	}
	
	public int getCustomberNumber()
	{
		return CustomerNumber;
	}
	
	public void setQuantityOrdered(int order)
	{
		QuantityOrdered=order;
	}

	public int getQuantityOrdered()
	{
		return QuantityOrdered;
	}

	public void setUnitPrice(double price)
	{
		UnitPrice=price;
	}
	
	public double getUnitPrice()
	{
		return UnitPrice;
	}
	
	public void setCustomerName(String name)
	{
		CustomerName=name;
	}
	
	public String getCustomerName()
	{
		return CustomerName;
	}
	
	public void inputCustomerName()
	{
	
		String customername = new String ("");
		System.out.println("Please enter customer's name :");	
	}
	
	public void displayCustomerName()
	{
		
System.out.println("The customer name you entered is : " + CustomerName);
	}
	
	public void inputCustomerNumber()
	{
	
		String customernumber = new String ("");
		System.out.println("Please enter customer's number :");	
	}

	public void displayCustomerNumber()
	{
		System.out.println("The customer number you entered is : " + CustomerNumber);

	}

	public void inputQuantityOrdered()
	{
		String quantityordered = new String ("");
		System.out.println("Please enter the quantity you want: ");

	}

	public void displayQuantityOrdered()
	{
		System.out.println("The quantity you ordered is : " + QuantityOrdered);

	}

	public void inputUnitPrice()
	{
		String unitprice=new String ("");
		System.out.println("Please enter the price per unit:");
	}

	public void displayUnitPrice()
	{
	System.out.println("The price per unit is: " + UnitPrice);
				
	}

	public void TotalPrice()
	{
		TotalPrice=QuantityOrdered*UnitPrice;
	}

	public void displayTotalPrice()
	{
		System.out.println(	"The total price is: " + TotalPrice);
			
	}
	public void ItemOrder()   //I don't know if I should use this one or the next one.
	{
	String ItemOrdered = new String (" ");
	System.out.println(" Enter the item you want to order:");
	}


public void choice(){  // I don't know which one to use, this or the upper one.
String unitprice=new String ("");
System.out.println("Enter the item you want to order:");
String choice = null;
int OrderChoice = Integer.parseInt(choice);
	
}

}

