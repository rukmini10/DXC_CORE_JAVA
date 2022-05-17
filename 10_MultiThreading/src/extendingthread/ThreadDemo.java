package extendingthread;

class ThreadDemo1 extends Thread{
	public void run() {
		System.out.print("\n got processor time...");
		for(int i=1;i<30;i++) {
			System.out.print("\nThread name:"+this.getName()+"Thread priority : "+this.getPriority());
		   try {
			   this.sleep(500);
		   }catch(InterruptedException e) {
			   e.printStackTrace();
		   }
		}
		System.out.print("\n thread:"+this.getName()+"is out...");
	}

}
class ThreadDemo2 extends Thread{
	private static final int MAX = 0;

	public void run() {
		System.out.print("\n got processor time...");
		for(int i=1;i<30;i++) {
			System.out.print("\nThread name:"+this.getName()+"Thread priority : "+this.getPriority());
			this.setPriority(MAX_PRIORITY);
		  
		  if(i==20) {
			  System.out.print("\nExisting priority is : "+this.getPriority());
			  
			  
		  }
		}
		System.out.print("\n thread:"+this.getName()+"is out...");
	}

}
public class ThreadDemo{
public static void main(String[] args) {
	System.out.print("\nMother Thread started...");
	ThreadDemo1 demo1=new ThreadDemo1();
	System.out.print("\nDemo1 Thread started...");
demo1.start();
	
	ThreadDemo2 demo2=new ThreadDemo2();
	System.out.print("\nDemo2 Thread started...");
demo2.start();

System.out.print("\nMother Thread ended...");
demo2.setPriority(8);
}
	
}