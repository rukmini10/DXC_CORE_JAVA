package lambda;
@FunctionalInterface

interface IncrementalFunctionalInterface{
	public int incrementBy5(int num); 
		
	
}
public class IncrementalFunctionalInterfaceCalling {
	public static void main(String[] args) {
		IncrementalFunctionalInterface ifi=(num) -> num+5;
		System.out.println(ifi.incrementBy5(23));
		
		
		
	}
}
