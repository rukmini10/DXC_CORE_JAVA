package controllingthread;

public class StropThread extends Thread{
	public volatile boolean stop_flag=true;
	public void stopRunning() {
		stop_flag=false;
	}
	public void run() {
		while(stop_flag) {
			System.out.print("\nThread running..");
		}
		System.out.print("\nThread stop now..");
	}
}
