//Question5
/*Create a class named CollegeCourse that includes data fields that hold the department (for example,
“ENG”), the course number (for example, 101), the credits (for example, 3), and the fee for the course (for
example, Rs360). All of the fields are required as arguments to the constructor, except for the fee, which is
calculated at $120 per credit hour.
Add a display()method that displays the course data. Create a subclass named LabCourse that adds $50 to the
course fee. Override the parent class display()method to indicate that the course is a lab course and to display all
the data. Write an application named UseCourse that prompts the user for course information. If the user enters
a class in any of the following departments, create a LabCourse: BIO, CHM, CIS, or PHY. If the user enters any
other department, create a CollegeCourse that does not include the lab fee. Then display the course data. Save
the files as CollegeCourse.java, LabCourse.java, and UseCourse.java
*/
package q5;
import java.util.Scanner;
public class CollegeCourse {
protected String dept;
protected int course_num;
protected int credits;
private double fee;

public CollegeCourse(String dept, int course_num, int credits) {
	super();
	this.dept = dept;
	this.course_num=course_num;
	this.credits = credits;
	this.fee = this.credits*120;
}

public void display() {
	System.out.println(this.dept+""+this.course_num);
	System.out.println("No Lab Course");
	System.out.println(this.credits+"credits");
	System.out.println("Total Amount of fee is $"+this.fee);
}





}
