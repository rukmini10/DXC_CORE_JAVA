package list.employee;

public class Employee {
	private static int id=100;
	//member variables
	private int empId;
	private String empName;
	private String deptName;
	private double empSalary;
	//getter/setters
	public int getEmpId() {
		return empId;
	}
	private void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empsalary) {
		this.empSalary = empsalary;
	}
	// no arg constructor()
	public Employee() {
	this.setEmpId(id++);
	}
	//parameterized constructor()
	public Employee(int empId, String empName, String deptName, double empSalary) {
		this.setEmpId(id++);
		this.empId = empId;
		this.empName = empName;
		this.deptName = deptName;
		this.empSalary = empSalary;
	}
	//toString()
	@Override
	public String toString() {
		return "\n" + empId + ", " + empName + ", " + deptName + ", "+ empSalary;
	}
	
	
	
	

}
