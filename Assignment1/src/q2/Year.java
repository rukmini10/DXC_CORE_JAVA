/* a) Create a class named Year that contains a data that holds the number of days in a year. Make a
constructor that sets the number of days to 365. Include a getter method that displays the number of days.
Create another subclass named LeapYear. It calls Year’s constructor and sets the number of days to 366.
Make a service class name UseYear that instantiates one object of each class and displays their data. Save the
files as Year.java, LeapYear.java, and UseYear.java
 */


package q2;

public class Year {
	public int num_of_days;

	public Year() {
		num_of_days=365;
	}

	public int getNum_of_days() {
		return num_of_days;
	}

	
	
	

}
