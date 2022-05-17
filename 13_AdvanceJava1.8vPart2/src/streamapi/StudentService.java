package streamapi;
/*
Employee:
stuId
stuName
stuAge
stuDept
marks
stuGrade
*/

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {
private int	stuId;
private int stuAge;
private String stuName;
private String stuDept;
private int	stuMarks;
private String stuGrade;
public int getStuId() {
	return stuId;
}
public void setStuId(int stuId) {
	this.stuId = stuId;
}
public int getStuAge() {
	return stuAge;
}
public void setStuAge(int stuAge) {
	this.stuAge = stuAge;
}
public String getStuName() {
	return stuName;
}
public void setStuName(String stuName) {
	this.stuName = stuName;
}
public String getStuDept() {
	return stuDept;
}
public void setStuDept(String stuDept) {
	this.stuDept = stuDept;
}
public int getStuMarks() {
	return stuMarks;
}
public void setStuMarks(int stuMarks) {
	this.stuMarks = stuMarks;
}
public String getStuGrade() {
	return stuGrade;
}
public void setStuGrade(String stuGrade) {
	this.stuGrade = stuGrade;
}
public Student(int stuId, int stuAge, String stuName, String stuDept, int stuMarks, String stuGrade) {
	super();
	this.stuId = stuId;
	this.stuAge = stuAge;
	this.stuName = stuName;
	this.stuDept = stuDept;
	this.stuMarks = stuMarks;
	this.stuGrade = stuGrade;
}
public Student() {
	
}
@Override
public String toString() {
	return "\n" + stuId + "," + stuAge + "," + stuName + "," + stuDept
			+ "," + stuMarks + "," + stuGrade ;
}



}
public class StudentService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
List<Student> students=Arrays.asList(
				
				new Student(1,23,"Rukmini","CSE",450,"Pass"),
				new Student(2,22,"Praveen","CSE",480,"Pass"),
				new Student(3,23,"Saikumar","ECE",470,"Pass"),
				new Student(4,23,"Pranav","EEE",460,"Pass"),
				new Student(5,23,"Subash","ECE",150,"Fail"),
				new Student(6,23,"Nishith","CSE",350,"Fail"),
				new Student(7,23,"Spandana","EEE",250,"Pass"),
				new Student(8,23,"Raghu","MECH",400,"Pass"),
				new Student(9,23,"Atheeq","CIVIL",450,"Pass"),
				new Student(10,23,"Snehith","CSE",150,"Fail"),
				new Student(11,23,"Nikhil","CIVIL",250,"Fail")
				);

//1.calculate total marks of all students

	Double totalMarks1=students.stream()
			.collect(Collectors.summingDouble(Student::getStuMarks));
	System.out.println("\nTotal Marks of All Students.....");
				System.out.println(totalMarks1);
				
				//2.Grouping the students dept wise
				
				Map<String,List<Student>> studentDeptWise=students.stream()
				.collect(Collectors.groupingBy(Student::getStuDept));

				System.out.println(studentDeptWise);
				
				//3.calculate sum of salaries dept wise

				Map<String,Integer> deptWiseSalary=students.stream()
				.collect(Collectors.groupingBy(Student::getStuDept,
						Collectors.summingInt(Student::getStuMarks)));
				System.out.println("Department Wise sum................");
				System.out.println(deptWiseSalary);
				
				//4.partitoning students into grade wise
				Map<Boolean,List<Student>> grade=students.stream()
				.collect(Collectors.partitioningBy(stu -> stu.getStuGrade()
						.equals("Pass")));
				System.out.println("Student Grades.......");
				System.out.println(grade);

	}

}
