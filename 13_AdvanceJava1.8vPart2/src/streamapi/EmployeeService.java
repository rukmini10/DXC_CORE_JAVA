package streamapi;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Employee:
empId
empName
empDept
salary
empAppraisalGrade

-----------------
1.calculate totalSalary of all employees
2.make grp of employees dept wise
3.calculate sum of salaries dept wise
4.partitoning employees into appraisalgradewise

*/


class Employee {
private int	empId;
private String empName;
private String empDept;
private int	salary;
private String empAppraisalGrade;




	public int getEmpId() {
	return empId;
}




public void setEmpId(int empId) {
	this.empId = empId;
}




public String getEmpName() {
	return empName;
}




public void setEmpName(String empName) {
	this.empName = empName;
}




public String getEmpDept() {
	return empDept;
}




public void setEmpDept(String empDept) {
	this.empDept = empDept;
}




public int getSalary() {
	return salary;
}




public void setSalary(int salary) {
	this.salary = salary;
}




public String getEmpAppraisalGrade() {
	return empAppraisalGrade;
}




public void setEmpAppraisalGrade(String empAppraisalGrade) {
	this.empAppraisalGrade = empAppraisalGrade;
}




	public Employee() {
	
}

	public Employee(int empId, String empName, String empDept, int salary, String empAppraisalGrade) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empDept = empDept;
	this.salary = salary;
	this.empAppraisalGrade = empAppraisalGrade;
}




	@Override
public String toString() {
	return "\n" + empId + "," + empName + "," + empDept + "," + salary
			+ ", " + empAppraisalGrade ;
}

}
public class EmployeeService{
	

	public static void main(String[] args) {
		//0.creating few employees object
		// TODO Auto-generated method stub
		List<Employee> employees=Arrays.asList(
				
				new Employee(102,"Rukmini","HR",560080,"Pass"),
				new Employee(103,"ishvariya","Development",576000,"Fail"),
				new Employee(104,"fatima","Development",560500,"Pass"),
				new Employee(105,"harish","Production",560030,"Pass"),
				new Employee(106,"pavan","HR",560010,"Fail"),
				new Employee(107,"karthik","Production",560050,"Pass"),
				new Employee(108,"chaitanya","Development",560500,"Pass")
				
				
				);
		//1.calculate total salary of all employees
Double totalSalary=employees.stream()
.collect(Collectors.summingDouble(Employee::getSalary));
	
	System.out.println("\nTotal Salary:"+totalSalary);

	//Total Salary:DoubleSummaryStatistics{count=7, sum=3937170.000000, min=560010.000000, average=562452.857143, max=576000.000000}
	
	DoubleSummaryStatistics totalSalary1=employees.stream()
			.collect(Collectors.summarizingDouble(Employee::getSalary));
				
				System.out.println("\nTotal Salary:"+totalSalary1);
	
				//2.make grp of employees dept wise
				
Map<String,List<Employee>> employeeDeptWise=employees.stream()
.collect(Collectors.groupingBy(Employee::getEmpDept));

System.out.println(employeeDeptWise);


//3.calculate sum of salaries dept wise

Map<String,Integer> deptWiseSalary=employees.stream()
.collect(Collectors.groupingBy(Employee::getEmpDept,
		Collectors.summingInt(Employee::getSalary)));

System.out.println(deptWiseSalary);

//4.partitoning employees into appraisalgradewise
Map<Boolean,List<Employee>> appraisalGrade=employees.stream()
.collect(Collectors.partitioningBy(emp -> emp.getEmpAppraisalGrade()
		.equals("Pass")));
System.out.println(appraisalGrade);
	}

}
