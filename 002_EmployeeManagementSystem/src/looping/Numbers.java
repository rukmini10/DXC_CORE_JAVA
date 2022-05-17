package looping;

public class Numbers {
	
	//0. find x to the power n
	public int findPower(int num, int power) {
		int temp=1;
		for(int i=1;i<=power;i++) {
			temp=temp*num;
		}
		return temp;
	}
	
	
	//1.display all numbers between num1 to num2 / any 2 numbers
	public void allNumberBetweenN1AndN2(int num1,int num2){
		if(num1>num2) {
		int temp=num1;
		num1=num2;
		num2=temp;
		
	}
	for(int i=num1;i<=num2;i++) {
		System.out.println(i);
	}
	
	}	
	
	//2.count number of digits
	
	public int countDigitInNumber(int num) {
		int count=0;
		for(int temp=num;temp>0;temp/=10) {
			count++;
		}
		return count;
	}
	//3.reverse of a number
	public int reversedNumber(int num) {
		int revNumber=0;
		for(int temp=num;temp>0;temp/=10) {
			revNumber=revNumber*10+(temp%10);
		}
		return revNumber;
	}
	// 4.check whether given number is amstrong or not
	/*
	 * find number of digits
	 * find x to the power n
	 * find out their sum
	 */
	public boolean isArmStrong(int num) {
		int count=countDigitInNumber(num);
		int sum=0,number;
		for(int temp=num,digit;temp>0;temp/=10) {
			digit=num%10;
			number=findPower(digit,count);
			//System.out.print(number);
			sum=sum+number;
		}
		if(sum==num) {
			return true;
		}
		else {
return false;
		}
	     
	}
	
}
