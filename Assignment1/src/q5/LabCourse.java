package q5;

public class LabCourse extends CollegeCourse{
	private int LabFee;

	public LabCourse(String dept, int course_num, int credits, int LabFee) {
		super(dept, course_num, credits);
		this.LabFee=LabFee;
		// TODO Auto-generated constructor stub
	}
	public void display() {
		System.out.println(this.dept+""+this.course_num);
		System.out.println("Lab Course");
		System.out.println(this.credits+"credits");
		System.out.println("Lab Fee is $"+this.LabFee);
		System.out.println("Total Amount of fee is $ "+this.LabFee);
	}
	
}
