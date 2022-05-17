package looping;

public class NumberService {

	public static void main(String[] args) {
		Numbers numbers=new Numbers();
	//Q1
		numbers.allNumberBetweenN1AndN2(67, 34);
		//Q2
		int count=numbers.countDigitInNumber(36021564);
		System.out.println("Number of digits: "+count);
	//Q3
		int rev=numbers.reversedNumber(36021564);
		System.out.println("Reverse Number: "+rev);
		
		//Q4
		
		System.out.println(numbers.isArmStrong(153));
	
	
	}

}
