package innerclass;

public class School {
class Student{
	private int rollNumber;
	private String name;
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "\nStudent=>" + rollNumber + "," + name;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNumber, String name) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
	}	
	
}

private School.Student student =new School.Student(12,"Rukmini");

//to display info
public Student getStudent() {
	return student;
}


public void ShowStudent() {
	//System.out.println(this.student.toString());
//or 
	System.out.println(student);
}




}
