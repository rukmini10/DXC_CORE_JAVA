package list.employee;

import java.util.Scanner;
public class EmployeeService {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		EmployeeOperationImpl service=new EmployeeOperationImpl();
		int choice;
		int empId;
		String deptName;
		String empName;
		double empSalary;
		Employee temp=null;
	do {
		System.out.print("\n1. Add Employee ");
		System.out.print("\n2. Get Employee By EmpId ");
		System.out.print("\n3. Get All Employees ");
		System.out.print("\n4. Del Employee By EmpId ");
		System.out.print("\n5. Del All Employees ");
		System.out.print("\n6. Mod Employee Salary ");
		System.out.print("\n7. Mod Employee Dept Name ");
		System.out.print("\n8. Mod Employee All Data ");
		System.out.print("\n9. Search Employee By Emp Name ");
		System.out.print("\n0. Exit ");
		System.out.print("\nEnter your choice(0-9): ");
		choice=keyboard.nextInt();
		switch(choice) {
		case 1:
			temp=new Employee();
			System.out.print("\nEnter employee name:");
			temp.setEmpName(keyboard.next());
			System.out.print("\nEnter department name:");
			temp.setDeptName(keyboard.next());
			System.out.print("\nEnter Employee Salary:");
			temp.setEmpSalary(keyboard.nextDouble());
			service.addEmployee(temp);
			break;
		case 2:
			System.out.print("\nEnter employee Id:");
			empId=keyboard.nextInt();
			temp=service.getEmployeeByEmpId(empId);
			System.out.print(temp);
			break;
		case 3:
			service.getAllEmployee();
			break;
		case 4:
			System.out.print("\nEnter employee Id:");
			empId=keyboard.nextInt();
			service.delEmployee(empId);
			break;
		case 5:
			service.delAllEmployee();
			break;
		case 6:
			System.out.print("\nEnter employee Id:");
			empId=keyboard.nextInt();
			System.out.print("\nEnter employee New Salary:");
			empSalary=keyboard.nextDouble();
			service.modEmployee(empId, empSalary);
			break;
		case 7:
			System.out.print("\nEnter employee Id:");
			empId=keyboard.nextInt();
			System.out.print("\nEnter Dept Name:");
			deptName=keyboard.next();
			service.modEmployee(empId, deptName);
			break;
		case 8:
			System.out.print("\nEnter employee Id:");
			empId=keyboard.nextInt();
			System.out.print("\nEnter employee name:");
			empName=keyboard.next();
			System.out.print("\nEnter department name:");
			deptName=keyboard.next();
			System.out.print("\nEnter Employee Salary:");
			empSalary=keyboard.nextDouble();
			service.modEmployee(empId,empName,deptName,empSalary);
			break;
		case 9:
			System.out.print("\nEnter employee name:");
			empName=keyboard.next();
			service.searchEmployeeByEmpName(empName);
			break;
		case 0:
			System.out.print("\nEntered choice is not valide..:");
			break;
		default:
			System.out.print("\nInvalid choice.. try again...");
		}
	}while(choice!=0);
	}
}
