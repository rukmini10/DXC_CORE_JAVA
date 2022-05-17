package q5;
import java.util.*;
public class USeCourse {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String dept;
		String[] labCourses= {"CHM","PHY","BIO"};
		int course_num,credits,found=0,i;
	    System.out.print("Enter a course :");
	    dept=input.nextLine();
	    System.out.print("Enter Course Number");
	    course_num=input.nextInt();
	    System.out.print("Enter Course Credits");
	    credits=input.nextInt();
	    for(i=0;i<labCourses.length;i++) {
	    	if(labCourses[i].equals(dept)) {
	    		found=1;
	    	}
	    }
	    if(found==1) {
	    	LabCourse l=new LabCourse(dept,course_num,credits,50);
	    	l.display();
	    }
	    else {
	    	CollegeCourse c=new CollegeCourse(dept,course_num,credits);
	        c.display();
	    }
	}

}
