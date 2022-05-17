package interfaceinheritance;

public class CalculatorService {
public static void main(String[] args) {
	Calculator calc=new Calculator();
	System.out.println(calc.add(34,67));
	System.out.println(calc.sub(34,67));
	System.out.println(calc.compare(34,67));
	Calculator calc1=new Calculator();
	System.out.println(calc1.num);
}
}
