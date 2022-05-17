package streamwithfilter;

import java.util.Arrays;
import java.util.List;

class Employee{
	private String empName;
	private Integer empAge;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Integer getEmpAge() {
		return empAge;
	}
	public void setEmpAge(Integer empAge) {
		this.empAge = empAge;
	}
	public Employee(String empName, Integer empAge) {
		super();
		this.empName = empName;
		this.empAge = empAge;
	}
	@Override
	public String toString() {
		return "\n" + empName + "," + empAge;
	}
	
}

public class StreamWithFilter {

	public static void main(String[] args) {
		List<Employee> employees=Arrays.asList(new Employee("Pranav",23),
				new Employee("Rukmini",23),
				new Employee("Maneesha",26),
				new Employee("Pradeeep",22),
				new Employee("surendra",25),
				new Employee("saikumar",21)
				);
		//old fashion method
		//show first 3 records of list
		for(int i=0;i<employees.size();i++) {
			if(i<3) {
				System.out.println(employees.get(i));
			}
		}
		//show last 3 records
		for(int i=employees.size()-1,count=0;i>=0;i--) {
			if(count<3) {
				System.out.println(employees.get(i));
				count++;
			}
		}
		
		//new fashion method
		List<Employee> firstThreeRecords=employees.stream().limit(3).toList();
firstThreeRecords.stream().forEach(System.out::println);



List<Employee> firstThreeRecords2=employees.stream().limit(-3).toList();
firstThreeRecords2.stream().forEach(System.out::println);

	}

}



/*

Product 
id
name
price
if(record>1000) {
	sysout
}




*/




