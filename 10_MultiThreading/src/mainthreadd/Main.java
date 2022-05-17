package mainthreadd;

public class Main {

	public static void main(String[] args) {
		//creating a thread
		Thread t=Thread.currentThread();
	    System.out.println("\nCurrent Thread:"+t.getName());
	    t.setName("Java");
	    System.out.println("\nAfter Renaming Thread:"+t.getName());
	   System.out.println("\nMain Thread Priority:"+t.getPriority());
	  //now changing priority //setting new priority
	   t.setPriority(10);
	   System.out.println("\nMain Thread new Priority:"+t.getPriority());
		 for(int i=0;i<5;i++) {
			 System.out.println("Main THread");			 
		 }
		 //creating child thread object
		 Thread ct=new Thread() {
			 public void run() {
			 for(int i=0;i<5;i++) {
			System.out.println("Child Thread");	 
			 }
			 }
		 };
		 System.out.println("\nChild Thread Priority:"+ct.getPriority());
			ct.start();
	}

}


/*
 *
 * 
 */
 





