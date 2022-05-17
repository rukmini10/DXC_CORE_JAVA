/*dd a method named daysElapsed() to the Year class you created in last Exercise 2(a).
The daysElapsed()method accepts two arguments representing a month and a day; it returns an integer
indicating the number of days that have elapsed since January 1 of that year. For example, on March 3 in
nonleap years, 61 days have elapsed (31 in January, 28 in February, and 2 in March).
Create a daysElapsed()method for the LeapYear class that overrides the method in the Year class. For example,
on March 3 in a LeapYear, 62 days have elapsed (31 in January, 29 in February, and 2 in March).
Write an application named UseYear2 that prompts the user for a month and day, and calculates the days
elapsed in a Year and in a LeapYear. Save the files as Year2.java, LeapYear2.java, and UseYear2.java.
 * 
 * 
 */

package q2b;

public class Year2 {
	public int num_of_days;

	public Year2() {
		num_of_days=365;
	}

	public int getNum_of_days() {
		return num_of_days;
	}

	public int daysElapsed(int day,int month)
	{
	int temp = 0;
	for(int i=1;i<month;i++)
	{
	if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12)
	{
	temp += 31;
	}
	else if(i==4 || i==6 || i==9 || i==11)
	{
	temp += 30;
	}
	else if(i==2)
	{
	temp += 28;
	}
	}
	temp += day;
	return temp;
	}
	}	
	
	


