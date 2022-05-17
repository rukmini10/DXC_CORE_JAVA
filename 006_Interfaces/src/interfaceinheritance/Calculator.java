package interfaceinheritance;

public class Calculator implements Comparission,NumberConstant{

	



	@Override
	public int add(int num1, int num2) {
		return num1+num2;
		
	}

	@Override
	public int sub(int num1, int num2) {
		return num1-num2;
		
	}

	@Override
	public String compare(int num1, int num2) {
		String res=null;
		if(num1>num2) {
			res=num1+" is bigger than "+num2;
		}
		else if(num2>num1){
			res=num2+" is bigger than "+num1;
		}
		else {
			res="Both numbers "+num1+" and "+num2 +" are equal";
		}
		return res;
	}

}
