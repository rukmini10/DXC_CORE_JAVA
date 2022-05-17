package lambda;
@FunctionalInterface
interface DisplayFunctionalInterface{
	
	void sayGreetings();
}

@FunctionalInterface
interface DisplayFunctionalInterface2{
	
String sayGreetings();
}



public class ClassForNonParameterLambda {

	public static void main(String[] args) {
		
		DisplayFunctionalInterface greetings=() ->{
			System.out.println("Hi all, how are you");
		};
	
		greetings.sayGreetings();
		
		
		
		DisplayFunctionalInterface2 greet=() ->{
			return("Hi , how are you today");
		};
		greet.sayGreetings();
		System.out.println(greet.sayGreetings());
	}

}
