package datetime;
//Java code for LocalDate
/// LocalTime Function
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public class Date {
public static void LocalDateTimeApi()
{
 // the current date
 LocalDate date = LocalDate.now();
 System.out.println("the current date is "+date);
 
// the current time
 LocalTime time = LocalTime.now();
 System.out.println("the current time is "+time);
 
// will give us the current time and date
 LocalDateTime current = LocalDateTime.now();
 System.out.println("current date and time : "+current);
 
// to print in a particular format
 DateTimeFormatter format =   DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); 
 String formatedDateTime = current.format(format); 
 System.out.println("in foramatted manner "+formatedDateTime);
 
// printing months days and seconds
 Month month = current.getMonth();
 int day = current.getDayOfMonth();
 int seconds = current.getSecond();
 System.out.println("Month : "+month+" day : "+day+" seconds : "+seconds);
 
// printing some specified date
 LocalDate date2 = LocalDate.of(1950,1,26);
 System.out.println("the republic day :"+date2);

 // printing date with current time.
 LocalDateTime specificDate =current.withDayOfMonth(24).withYear(2016);
 System.out.println("specific date with "+"current time : "+specificDate);
 
 //add 2 hours in my current time
 LocalTime time2=LocalTime.now();
 LocalTime time3=time2.plusHours(2);
 System.out.println("old time:"+time2);
 System.out.println("new time:"+time3);
 
 //How do I find date after 1 week
 LocalDate today=LocalDate.now();
 System.out.println("today:"+today);
 LocalDate nextweek=today.plus(1, ChronoUnit.WEEKS);
 System.out.println("nextweek:"+nextweek);
}
 // Driver code
 public static void main(String[] args)
 {
     LocalDateTimeApi();
 }
}