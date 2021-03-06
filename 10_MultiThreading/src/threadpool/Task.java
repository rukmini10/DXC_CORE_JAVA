package threadpool;

import java.util.Date;

import java.text.SimpleDateFormat;
public class Task implements Runnable{
public String name;
public Task(String name) {
	this.name=name;
}

	@Override
	public void run() {
		try {
			for(int i=0;i<5;i++) {
				if(i==0) {
					Date today=new Date();
					SimpleDateFormat ft=new SimpleDateFormat("hh:mm:ss");
				    System.out.println("\nStart time for"+"task name"+name+"="+ft.format(today));
				}else {
					Date today=new Date();
					SimpleDateFormat ft=new SimpleDateFormat("hh:mm:ss");
				    System.out.println("\nStart time for"+"task name"+name+"="+ft.format(today));
		
				}
				Thread.sleep(1000);
				
			}
			System.out.println("\n"+name+"Completed....");
		}catch(InterruptedException e) {
		e.printStackTrace();	
		}
		System.out.println("\n"+name+"Completed....");
	}

}


/*
 *create a task
 *create executor pool with help of executors
 *shutdown the executor pool 
 */
