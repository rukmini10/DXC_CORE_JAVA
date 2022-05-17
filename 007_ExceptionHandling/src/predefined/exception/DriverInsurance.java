/*
java code to get birth year of diver and his/her driving experience years
find out their insurance premium
if age<18 and age>60 then driver is not applicable
if age>18 and having experience less than 5 years then he/she has to pay 5400
if age>18 and having experience till 10 years then he/she has to pay 5000
if age>18 and having experience till 20 years then he/she has to pay 4000
if age>18 and having experience till 30 years then he/she has to pay 3000
if age>18 and having experience greater than 30 years then he/she has to pay 3000
otherwise not applicable


*/

package predefined.exception;

public class DriverInsurance {
	private int driverAge;
	private int driverExperience;
	private int insurancePay;
	
	public int getDriverAge() {
		return driverAge;
	}
	public void setDriverAge(int driverAge) {
		this.driverAge = driverAge;
	}
	public int getDriverExperience() {
		return driverExperience;
	}
	public void setDriverInsuranceAge(int driverInsuranceAge) {
		this.driverExperience = driverExperience;
	}
	
	public int getInsurancePay() {
		return insurancePay;
	}
	public void setInsurancePay(int insurancePay) {
		this.insurancePay = insurancePay;
	}
	public DriverInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DriverInsurance(int driverAge, int driverExperience) {
		super();
		this.driverAge = driverAge;
		this.driverExperience = driverExperience;
		
	}

	
	@Override
	public String toString() {
		return "DriverInsurance [driverAge=" + driverAge + ", driverExperience=" + driverExperience + ", insurancePay="
				+ insurancePay + "]";
	}
	public String checkInsurance(){
		String errormessage=null;
		String validmessage=null;
		try {
			if(driverAge<18 || driverAge>60) {
				errormessage="\nDriver is not Applicable";
				throw new Exception(errormessage);
			}else if(driverAge>18) {
                        if((driverExperience>0)&& driverExperience<5) {
                        	insurancePay=5400;
                        	validmessage="\nDriver need to pay insurance amount"+insurancePay;
				
                        }else if((driverExperience>0)&&driverExperience<10) {
                        	insurancePay=4000;
                        	validmessage="\nDriver need to pay insurance amount"+insurancePay;
				
                        }else if((driverExperience>0)&&driverExperience<20) {
                        	insurancePay=3000;
                        	validmessage="\nDriver need to pay insurance amount"+insurancePay;
				
                        }else if((driverExperience>0)&&driverExperience<30) {
                        	insurancePay=2000;
                        	validmessage="\nDriver need to pay insurance amount"+insurancePay;
				
                        }
			}}catch(Exception e) {
			System.err.println(e.getMessage());
		}
		return validmessage;
		
		}
		
	}


