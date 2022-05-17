package list.employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeOperationImpl implements EmployeeOperation{
	private List <Employee>employees;
	
	public EmployeeOperationImpl() {
		employees=new ArrayList<Employee>();
	}

	@Override
	public void addEmployee(Employee emp) {
		employees.add(emp);	
	}

	@Override
	public Employee getEmployeeByEmpId(int empId) {
		Employee temp=searchEmployeeByEmpId(empId);
		return temp;
	}

	@Override
	public void delEmployee(int empId) {
		Employee temp=searchEmployeeByEmpId(empId);
		if(temp!=null) {
			System.out.print("\nRecord found:"+temp);
			employees.remove(temp);
			System.out.print("\nRecord has been deleted ...");
		}else {
			System.out.print("\nEntered employee id: "+empId+" not found in collection..");
		}
		
	}

	@Override
	public void delAllEmployee() {
		employees.clear();
		
	}

	@Override
	public void modEmployee(int empId, double empSalary) {
		Employee temp=null;
		boolean status=false;
		Iterator <Employee>itr=employees.iterator();
		while(itr.hasNext()) {
			temp=itr.next();
			if(temp.getEmpId()==empId) {
				System.out.print("\nRecord found:"+temp);
				temp.setEmpSalary(empSalary);
				status=true;
				break;
			}
		}
		if(status) {
			System.out.print("\nRecord has been modified..");
			getAllEmployee();
		}else {
			System.out.print("\nEntered employee id: "+empId+" not found in collection..");
		}
	}

	@Override
	public void modEmployee(int empId, String deptName) {
		Employee temp=null;
		boolean status=false;
		Iterator <Employee>itr=employees.iterator();
		while(itr.hasNext()) {
			temp=itr.next();
			if(temp.getDeptName().equals(deptName)) {
				System.out.print("\nRecord found:"+temp);
				temp.setDeptName(deptName);
				status=true;
				break;
			}
		}
		if(status) {
			System.out.print("\nRecord has been modified..");
			getAllEmployee();
		}else {
			System.out.print("\nEntered employee id: "+empId+" not found in collection..");
		}
		
	}

	@Override
	public void modEmployee(int empId, String empName, String deptName, double empSalary) {
		Employee temp=null;
		boolean status=false;
		Iterator <Employee>itr=employees.iterator();
		while(itr.hasNext()) {
			temp=itr.next();
			if(temp.getEmpId()==empId) {
				System.out.print("\nRecord found:"+temp);
				temp.setEmpName(empName);
				temp.setDeptName(deptName);
				temp.setEmpSalary(empSalary);
				status=true;
				break;
			}
		}
		if(status) {
			System.out.print("\nRecord has been modified");
			getAllEmployee();
		}else {
			System.err.print("\n Entered empld:"+empId+ " not found...");
		}
		
	}

	@Override
	public Employee searchEmployeeByEmpId(int empId) {
		Employee temp=null;
		for(Employee emp:employees) {
			if(emp.getEmpId()==empId) {
				temp=emp;
			}
		}
		return temp;
	}

	@Override
	public void searchEmployeeByEmpName(String empName) {
		Employee temp=null;
		for(Employee emp:employees) {
			if(emp.getEmpName().equals(empName)) {
				System.out.print(emp);
			}
		}
		
	}

	@Override
	public void getAllEmployee() {
		System.out.print("\nAll Employees details are:");
		for(Employee emp:employees) {
			System.out.print(emp);
			}
	}

}
