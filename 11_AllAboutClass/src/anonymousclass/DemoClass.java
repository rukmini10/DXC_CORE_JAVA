package anonymousclass;
public class DemoClass {
void display() {
	System.out.println("Hi, I am from Demo CLass...");
	
}
public static void main(String[] args) {
	DemoClass demo=new DemoClass() {
		void display() {
			System.out.println("Hi, I am not in Demo CLass...");
		}
	};
	demo.display();
}
}

