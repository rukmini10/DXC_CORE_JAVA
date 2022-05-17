package functioninterface;
public class Planner {}
/*
 * Buit-in Functional Interface in java
 * 
 * Functional interfaces you may get from package:java.util.function.*
 * 1. Consumer
 * A kind of functional interface which accept one value but return nothing.
 * 		consumer accept single parameter
 * 		Bi-consumer, it takes two parameter
 * public interface Consumer<T>{
 * 	public void print(T t);
 * }
 * Consumer<Integer> consumer=(value) -> System.out.print("Hi all");
 * System.out.print();
 * 2. Predicate
 * A kind of functional interface which accept single value and return either true or false.
 * public interface Predicate<T>{
 * 	public boolean isElectronic(T t);
 * }
 * 
 * public class CheckProduct implements Predicate{
 *  	@Override
 *  	public boolean isElectronic(String productName){
 *  		//check if first charater is 'e' or not
 *  		if(productName.charAt(0)=='e')
 *  			return true;
 *  		else
 *  			return false;
 *  	}
 * }
 * 
 *for lambda expression
 *Preducate predicate=(value) -> productName.charAt(0)=='e';
 *
 * 3. Function:
 *1. Unary Operator

@FunctionalInterface
public interface UnaryOperator<T> extends Function<T, U> 
{
    ……...
}
 2. Binary Operator

@FunctionalInterface
public interface BinaryOperator<T> extends BiFunction<T, U, R> 
{
    ……...
}
 * 4. Supplier
 * @FunctionalInterface
public interface Supplier<T>{
    T getId();
}
 * 
 * 
 * 
 * 
 * 
 * 
 */
