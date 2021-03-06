package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	static final int MAX_THREADS=3;
	public static void main(String[] args) {
		Runnable r1=new Task("task1");
		Runnable r2=new Task("task2");
		Runnable r3=new Task("task3");
		Runnable r4=new Task("task4");
		Runnable r5=new Task("task5");
		Runnable r6=new Task("task6");
		
		ExecutorService pool=Executors.newFixedThreadPool(MAX_THREADS);
		pool.execute(r1);
		pool.execute(r2);
		pool.execute(r3);
		pool.execute(r4);
		pool.execute(r5);
		pool.execute(r6);
		
		pool.shutdown();
	}
}
