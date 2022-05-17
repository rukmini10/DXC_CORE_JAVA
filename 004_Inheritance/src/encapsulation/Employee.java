package encapsulation;

/*
 * Binding data and their related behaviour together in a form of class
 * data hiding can be implement by making member data private
 * 
 */

public class Employee {
	private int empid;
	private String name;
	private String empDept;
	private double empBasicSalary;
	public Employee() {
		
	}
	public Employee(int empid, String name, String empDept, double empBasicSalary) {
		super();
		this.empid = empid;
		this.name = name;
		this.empDept = empDept;
		this.empBasicSalary = empBasicSalary;
	}
	@Override
	public String toString() {
		return "\nempid=" + empid + ", name=" + name + ", empDept=" + empDept + ", empBasicSalary="
				+ empBasicSalary;
	}
	
}
