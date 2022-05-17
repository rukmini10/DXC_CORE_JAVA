package singleInheritence;

public class EmployeeService {
public static void main(String[] args) {
	Person person=new Person("Rukmini","Chebrolu","9505918828");
	System.out.println(person);

Employee emp=new Employee(777,"Rukmini","Chebrolu","9505918828",845789);
System.out.println(emp);
}

}
