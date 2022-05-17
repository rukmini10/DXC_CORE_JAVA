package predefined.exception;

public class DriverService {
	public static void main(String[] args) {
		DriverInsurance driver=new DriverInsurance(50,22);
		System.out.println(driver.checkInsurance());
		driver=new DriverInsurance(17,0);
		System.out.println(driver.checkInsurance());
	}

}
