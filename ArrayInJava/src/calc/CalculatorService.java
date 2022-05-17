package calc;

public class CalculatorService {

	public static void main(String[] args) {
		Calculator calc=new Calculator();
		InputOutput io=new InputOutput();
		int choice=0,num1=0,num2=0,res;
		do {
			io.output("\n1.Add");
			io.output("\n2.Sub");
			io.output("\n3.Mul");
			io.output("\n4.Div");
			io.output("\n0.Exit");
			choice=io.input("Enter your choice(0-4)");
			if(choice>=1 && choice<=4) {
				num1=io.input("Enter first number");
				num2=io.input("Enter second number");
			}
			switch(choice) {
		case 1:
			res=calc.add(num1, num2);
			io.output("Sum is ",res);
			break;
		case 2:
			res=calc.sub(num1, num2);
			io.output("Sub is ",res);
			break;
		case 3:
			res=calc.mul(num1,num2);
			io.output("Mul is ",res);
		case 4:
			res=calc.div(num1, num2);
			io.output("div is ",res);
		case 0:
			io.output("App terminated ");
			break;
		default:
			io.error("INvalid choice");
			
				
			}
		}while(choice!=0);
	
	}

}
/*
design area calculator for circle, rectangle and square
note:no system.out.println()
and scanner is not allowed for main method
*/