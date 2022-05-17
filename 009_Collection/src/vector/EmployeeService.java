package vector;

public class EmployeeService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeCURDOperation emp=new EmployeeCURDOperation();
		emp.addEmployee(new Employee(111, "Aditya"));
		emp.addEmployee(new Employee(222, "Anudeep"));
		emp.addEmployee(new Employee(333, "Shiva"));
		
		//display all employee records
		System.out.print("\nRest employees details:\n");
		emp.displayAllEmployees();
		
		//show employee which empid is 222
		Employee e=(Employee)emp.getEmployee(222);
		e.getEmployeeDetails();
		
		//remove employee which empid is 333
		System.out.println();
		emp.delEmployee(333);
		
		//display all employee records
		System.out.print("\nRest employees details:\n");
		emp.displayAllEmployees();
		
		//modify employee name as Prathyush for employee id 222
		emp.modEmployee(222, "Prathyush");
		
		System.out.print("\nRest employees details after modifying name for emp id 222:\n");
		emp.displayAllEmployees();
		
		
		
	}

}
