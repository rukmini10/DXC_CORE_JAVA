package encapsulation;
/*
 * we are writting some methods for reading and writting
 * thats why we are using getter and setter
 * getter-used for reading(return some value) returntype getXXX()
 * setter-writting purpose(void setXXX(parameter)){}
 * for boolean-
 * Getter: returntyppe isXXX()
 * Setter: void setXXX(parameters){}
 * 
 */
public class Employee1 {
	private int empid;
	private String name;
	private String empDept;
	private double empBasicSalary;
	private boolean empStatus;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public double getEmpBasicSalary() {
		return empBasicSalary;
	}
	public void setEmpBasicSalary(double empBasicSalary) {
		this.empBasicSalary = empBasicSalary;
	}
	public boolean isEmpStatus() {
		return empStatus;
	}
	public void setEmpStatus(boolean empStatus) {
		this.empStatus = empStatus;
	}
	
	
	
	
	
	
	public Employee1(int empid, String name, String empDept, double empBasicSalary, boolean empStatus) {
		super();
		this.empid = empid;
		this.name = name;
		this.empDept = empDept;
		this.empBasicSalary = empBasicSalary;
		this.empStatus = empStatus;
	}
	@Override
	public String toString() {
		return "\nempid=" + empid + ", name=" + name + ", empDept=" + empDept + ", empBasicSalary="
				+ empBasicSalary + ", empStatus=" + empStatus;
	}
	
	
	
}
