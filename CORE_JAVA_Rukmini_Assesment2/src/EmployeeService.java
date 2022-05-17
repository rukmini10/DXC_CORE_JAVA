import java.util.Vector;

public class EmployeeService {
public static void main(String[] args) {
Vector<Employee> v =addInput();
display(v);
}
public static Vector<Employee> addInput()
{
Employee e1=new Employee(1,"Chebrolu","Rukmini");
Employee e2=new Employee(2,"Lakshmi","Pranav");
Employee e3=new Employee(3,"Saikumar","Nuthalapati");
Employee e4=new Employee(4,"Spandama","boyapati");
Vector<Employee> v = new Vector<Employee>();
v.add(e1);
v.add(e2);
v.add(e3);
v.add(e4);
return v;
}
public static void display(Vector<Employee>v)
{
for(Employee e:v)
{
System.out.println(e.getEmpid()+"\t"+e.getEmpname()+"\t"+e.getAddress());
}
}
}

