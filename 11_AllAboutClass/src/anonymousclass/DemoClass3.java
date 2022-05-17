package anonymousclass;
class Demo{
	public void sayGreetings() {
		System.out.print("\nGreeting all, welcome to java world.....");
	      
	}
}
public class DemoClass3 {

	public static void main(String[] args) {
	//	Demo demo=new Demo();
		//demo.sayGreetings();
	
	Demo demo=new Demo() {
		
		public void sayHi() {
			System.out.print("\nHi all,welcome to java world.....");
		      
		}
		public void sayGreetings() {
			System.out.print("\nGreeting all, welcome to spring world.....");
		 sayHi();     
		}
	};
	demo.sayGreetings();
	
	}

}
