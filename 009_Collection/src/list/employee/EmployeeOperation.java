package list.employee;

import java.util.List;

public interface EmployeeOperation {
	 void addEmployee(Employee emp);
	 Employee getEmployeeByEmpId(int empId);
	  void getAllEmployee( );
	 void delEmployee(int empId);
	 void delAllEmployee();
	 void modEmployee(int empId,double empSalary);
	 void modEmployee(int empId,String deptName);
	 void modEmployee(int empId,String EmpName,String deptName,double empSalary);
	 Employee searchEmployeeByEmpId(int empId);
	 void searchEmployeeByEmpName(String empName);
}
