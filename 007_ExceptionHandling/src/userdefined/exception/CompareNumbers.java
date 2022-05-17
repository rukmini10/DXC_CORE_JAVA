package userdefined.exception;

public class CompareNumbers {
	public void comparing(int num1,int num2) {
		try {
			if(num1>num2) {
				throw new CustomException(num1+" is greater than "+num2);
			}else if(num1<num2) {
				throw new CustomException(num1+" is smaller than "+num2);
			}else {
				
				throw new CustomException(num1+" and "+num2 +" are equal");
			}
			
		}catch(CustomException e) {
			System.err.println(e.getMessage());
			
		}
	}
	public static void main(String[] args) {
		CompareNumbers numbers=new CompareNumbers();
		numbers.comparing(45, 89);
	}

}
