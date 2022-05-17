package com.dxc.insurance;

public class PremiumCalculator extends Driver
{
	//super();
	int minAge=18;
	int age;
	int drivenYears;
	String message;
	
	public String calcInsurance()
	{drivenYears=age-minAge;
		try {
		
		if(age<minAge)
		{
			throw new TooYoungException("no need to pay insurance");
		
		}
		
		else if(drivenYears<=4)
		{
			System.out.println("Driver need to pay insurance amount i.e is 1000");
		}
		else
		{
			System.out.println("Driver need to pay insurance amount i.e is 600");
		}
	}
	catch(TooYoungException t1)
	{
		System.out.println(t1.getMessage());
	}
	return message;
}
}
