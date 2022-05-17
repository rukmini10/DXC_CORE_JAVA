package objectsharing;

public class SharedObject {
	int value1;
	
	synchronized void show(String name,int value2) {
		value1=value2;
		System.out.print("\nStarting method:"+name+":"+value1);
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			System.out.print("\n"+e.getMessage());
		}
		System.out.print("\nEnding method:"+name+":"+value1);
	}

}
