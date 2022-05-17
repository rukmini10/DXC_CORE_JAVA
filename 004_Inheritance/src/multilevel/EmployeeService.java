package multilevel;

public class EmployeeService {

	public static void main(String[] args) {
		Person person=new Person("Sanjay","Kumar","9818254421");
		System.out.println(person);
		
		Employee emp=new Employee(777,"Sanjay","Kumar","9818254421",78900);
		System.out.println(emp);
		
		Director director=new Director(999,"Harish","Kumar","9818254433",78900,"IT");
		System.out.println(director);
		
	}

}
