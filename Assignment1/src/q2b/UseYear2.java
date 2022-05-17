package q2b;

public class UseYear2 {

	public static void main(String[] args) {
		int day = 2,month = 3;
		Year2 year = new Year2();
		LeapYear2 leapyear = new LeapYear2();

		System.out.println("Days elapsed in a Year = "+year.daysElapsed(day,month));
		System.out.println("Days elapsed in a Leap Year = "+leapyear.daysElapsed(day,month));
	}

}
