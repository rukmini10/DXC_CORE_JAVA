package q2;

public class UseYear {

	public static void main(String[] args) {
		Year year = new Year();
		LeapYear leapyear = new LeapYear();

		System.out.println("No. of days in a year = "+year.getNum_of_days());
		System.out.println("No. of days in a Leap year = "+leapyear.getNum_of_days());
	}

}
