package generic;
//write java code to define a class that can hold any type of object and display it
class GenericClass3<T>{
	private T data;

	public GenericClass3() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GenericClass3(T data) {
		super();
		this.data = data;
	}

	public T getData() {
		return data;
	}

	
}
public class GenericClass {

	public static void main(String[] args) {
		GenericClass3<Integer> generic =new GenericClass3<>(123);		
		System.out.println("data is:"+generic.getData());
		
GenericClass3<String> generic2 =new GenericClass3<>("India");		
System.out.println("data is:"+generic2.getData());
	}

	
	
	
	/*
	 *write java code to make generic class which have to instance member of T type . get and display 
	 * */
	
}
