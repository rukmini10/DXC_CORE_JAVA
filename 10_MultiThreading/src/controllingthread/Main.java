package controllingthread;

public class Main {

	public static void main(String[] args) {
		StropThread thread=new StropThread();
		thread.start();
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//thread.stopRunning();
		if(thread.stop_flag)
			thread.stop_flag=false;
	}

}
