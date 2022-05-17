package project1;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DynamicProgram3 {

	public static void main(String[] args) throws IOException {
		BufferedReader keyboard=new BufferedReader(new InputStreamReader(System.in));
		String name;
		System.out.println("Enter your name");
		name=keyboard.readLine();
		System.out.println("Hello "+name+", you are welcome to java world");


	}

}
