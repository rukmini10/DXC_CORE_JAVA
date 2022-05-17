package dxc.student.marksinfo;

import java.util.Scanner;

import dxc.student.StudentInt;

public class StudentMarks implements StudentInt{
public int rollNo;
public String semester;
public float cProgramming;
public float coreJava;
public float advanceJava;
public float totalMarks;
public StudentMarks() {
	super();
	// TODO Auto-generated constructor stub
}
public StudentMarks(int rollNo, String semester, float cProgramming, float coreJava, float advanceJava,
		float totalMarks) {
	super();
	this.rollNo = rollNo;
	this.semester = semester;
	this.cProgramming = cProgramming;
	this.coreJava = coreJava;
	this.advanceJava = advanceJava;
	this.totalMarks = totalMarks;
}
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public String getSemester() {
	return semester;
}
public void setSemester(String semester) {
	this.semester = semester;
}
public float getcProgramming() {
	return cProgramming;
}
public void setcProgramming(float cProgramming) {
	this.cProgramming = cProgramming;
}
public float getCoreJava() {
	return coreJava;
}
public void setCoreJava(float coreJava) {
	this.coreJava = coreJava;
}
public float getAdvanceJava() {
	return advanceJava;
}
public void setAdvanceJava(float advanceJava) {
	this.advanceJava = advanceJava;
}
public float getTotalMarks() {
	return totalMarks;
}
public void setTotalMarks(float totalMarks) {
	this.totalMarks = totalMarks;
}
@Override
public String toString() {
	return "\n" + rollNo + "," + semester + "," + cProgramming
			+ "," + coreJava + "," + advanceJava + "," + totalMarks;
}
@Override
public void acceptStudentMarks(StudentMarks marks) {
	// TODO Auto-generated method stub
	Scanner in = new Scanner(System.in);
	 rollNo=in.nextInt();
	 semester=in.next();
	 cProgramming=in.nextFloat();
	 coreJava=in.nextFloat();
	 
	 advanceJava=in.nextFloat();
	 
	 totalMarks=in.nextFloat();
	
	
}
@Override
public void displayStudentMarks() {
	// TODO Auto-generated method stub
	
}



}
