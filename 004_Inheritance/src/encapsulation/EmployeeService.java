package encapsulation;

public class EmployeeService {

	public static void main(String[] args) {
		Employee emp=new Employee(111,"Rukmini","Production",67890);
		System.out.print(emp);
		
		
		Employee1 emp1=new Employee1(121,"Ruk","Production",87890,true);
		System.out.print(emp1);
		
		System.out.print("\n"+emp1.getEmpid()+" \t"+emp1.getEmpBasicSalary());
		emp1.setEmpDept("DEV");
		System.out.println(emp1);
	}

}
