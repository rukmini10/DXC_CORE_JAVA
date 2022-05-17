package project1;
import java.io.Console;

public class DynamicProgram {

	public static void main(String[] args) {
		Console console=System.console();
		String name;
		System.out.println("Enter your name");
		name=console.readLine();
		System.out.println("Hello "+name+", you are welcome to java world");


	}

}
