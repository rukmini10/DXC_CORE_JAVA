package multilevel;

public class Employee extends Person{
	private int empid;
	private double salary;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid,String firstName, String lastName, String contactNumber,double salary) {
		super(firstName, lastName, contactNumber);
		this.setEmpid(empid);
		this.setSalary(salary); 
	}
	
	@Override
	public String toString() {
		return "\nempid=" + empid +super.toString()+ ", salary=" + salary;
	}
	

}
