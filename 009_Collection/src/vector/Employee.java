package vector;

public class Employee {
	int empid;
	String name;
	public Employee(){

	}
	public Employee(int id,String name){
		empid=id;
		this.name=name;
	}
	public void getEmployeeDetails(){
		System.out.print("\n Employee id:"+empid+"\t Name:"+name);
	}
	
	public void updateName(String newname){
		name=newname;
	}
}
