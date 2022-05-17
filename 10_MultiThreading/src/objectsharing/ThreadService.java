package objectsharing;
class Thread1 extends Thread{
	SharedObject obj1;
	public Thread1(String name,SharedObject obj) {
		super(name);
		this.obj1=obj;
		this.start();
	}
	public void run() {
		obj1.show(Thread.currentThread().getName(), 5);
	}
}

class Thread2 extends Thread{
	SharedObject obj1;
	public Thread2(String name,SharedObject obj) {
		super(name);
		this.obj1=obj;
		this.start();
	}
	public void run() {
		obj1.show(Thread.currentThread().getName(), 10);
	}
}
class Thread3 extends Thread{
	SharedObject obj1;
	public Thread3(String name,SharedObject obj) {
		super(name);
		this.obj1=obj;
		this.start();
	}
	public void run() {
		obj1.show(Thread.currentThread().getName(), 2);
	}
}
public class ThreadService {

	public static void main(String[] args) {
		SharedObject object1=new SharedObject();
		Thread thread1=new Thread1("one",object1);
		Thread thread2=new Thread1("two",object1);
		Thread thread3=new Thread1("three",object1);

	}

}
