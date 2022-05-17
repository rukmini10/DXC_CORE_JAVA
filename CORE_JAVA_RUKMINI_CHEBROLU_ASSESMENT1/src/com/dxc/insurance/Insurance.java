package com.dxc.insurance;

public class Insurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver d=new Driver("Rukmini",23);
		d.displayInfo();
		PremiumCalculator p=new PremiumCalculator();
		p.calcInsurance();
	}

}
