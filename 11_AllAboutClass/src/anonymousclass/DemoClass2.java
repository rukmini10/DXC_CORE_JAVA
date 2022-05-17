package anonymousclass;
/*
 * interface method without using implement keyword
 */
interface Display{
	//void returns nothing
	void displayData();
}

public class DemoClass2 {
	
	static Display display=new Display() {
       public void displayData() {
		System.out.print("\nHi all i am overrided this method using anonymous class.....");
       }
     
	};
	public static void main(String[] args) {
		display.displayData();
	}
}
