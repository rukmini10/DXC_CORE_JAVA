package runnable;

class Thread1 implements Runnable{
	public void run() {
		for(int i=1;i<30;i++) {
			System.out.print("\nThread1 having values: "+i);
		}	
		System.out.print("\nThread1 is out now....");
		
	}
}
class Thread2 implements Runnable{
	public void run() {
		for(int i=1;i<30;i++) {
			System.out.print("\nThread2 having values: "+i);
		}	
		System.out.print("\nThread2 is out now....");
		
	}
}
class Thread3 implements Runnable{
	public void run() {
		for(int i=1;i<30;i++) {
			System.out.print("\nThread3 having values: "+i);
		}	
		System.out.print("\nThread3 is out now....");
		
	}
}

public class MultiThreadingByImplementingRunnable {
public static void main(String[] args) {
	System.out.print("\nMain Thread started....");

	/*two step method
	//	Thread1 threadObj1=new Thread1();
//  Thread thread1=new Thread(threadObj1);
	*/
	//single step method
	Thread thread1=new Thread(new Thread1());
	Thread thread2=new Thread(new Thread2());
	Thread thread3=new Thread(new Thread3());
	//setting new name to thread1
	thread1.setName("Java");
	System.out.print("\n"+thread1.getName()+"Started");
	System.out.print("\nMain Thread ended....");
	thread1.start();
	
	//setting new name to thread1
		thread2.setName("Hibernate");
		System.out.print("\n"+thread2.getName()+"Started");
		System.out.print("\nMain Thread ended....");
		thread2.start();
		thread2.setPriority(10);
	
		//setting new name to thread1
		thread3.setName("Spring");
		System.out.print("\n"+thread3.getName()+"Started");
		
		thread3.start();
		thread2.setPriority(2);
		System.out.print("\nMain Thread ended....");
}
}









