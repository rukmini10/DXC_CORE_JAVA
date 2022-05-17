

package q1;

public class UseOrder {
	public static void main (String [] args)
	{

		Order s = new ShippedOrder(1);
		s.displayTotalPrice();
		ShippedOrder s2 = new ShippedOrder(5);
		s2.displayTotalPrice();
	}

}
