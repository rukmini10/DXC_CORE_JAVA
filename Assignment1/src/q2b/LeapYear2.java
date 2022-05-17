package q2b;

public class LeapYear2 extends Year2{

	public LeapYear2() {
		num_of_days=366;
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
	temp += 29;
	}
	}
	temp += day;
	return temp;
	}

}
