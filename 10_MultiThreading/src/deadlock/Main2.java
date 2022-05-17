package deadlock;
public class Main2{
	public static Object Lock1=new Object();
	public static Object Lock2=new Object();
	public static void main(String args[]) {
		Main2 main=new Main2();
		ThreadOne thread1=main.new ThreadOne();
		ThreadTwo thread2=main.new ThreadTwo();
		thread1.start();
		thread2.start();
	}
	private class ThreadOne extends Thread{
		public void run() {
			synchronized(Lock1) {
				System.out.println("ThreadOnce :Holding lock1...");
			
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print("\nThreadOne: waiting for lock2..");
			synchronized(Lock2) {
				System.out.println("ThreadOnce :Holding lock1 & 2...");
			}
		}}
	}
	private class ThreadTwo extends Thread{
		public void run() {
			synchronized(Lock1) {
				System.out.println("ThreadTwo :Holding lock2...");
			
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print("\nThreadTow: waiting for lock1..");
			synchronized(Lock2) {
				System.out.println("ThreadOne :Holding lock1 & 2...");
			}}
		}
	}
}


