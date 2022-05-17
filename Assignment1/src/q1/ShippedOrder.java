package q1;

public class ShippedOrder extends Order
{
	private int TotalCost;
	int ShippingCost;
	char OrderChoice;

	public ShippedOrder(int i) {
		// TODO Auto-generated constructor stub
	}

	public void ShippedOrderChoice() {
	String choice = new String ();	
System.out.println("You want to ship your order? Y or N");

String Y = null;
String N;
if(choice==Y)
   ShippingCost = 4;

else
   ShippingCost = 0;

TotalCost = TotalCost + ShippingCost;
	}
}