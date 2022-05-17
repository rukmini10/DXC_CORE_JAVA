package vector;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class EmployeeCURDOperation {
		List <Employee>list=new Vector<Employee>();
		public void addEmployee(Employee emp){
			list.add(emp);
		}
		
		public Employee getEmployee(int empid){
			Employee temp=null;
			Iterator <Employee>itr = list.iterator();
	        while(itr.hasNext()){
	        	temp=itr.next();
	            if(temp.empid==empid){
	               	break;
	            }
	       }

			return (temp);
		}
		
		public void delEmployee(int empid){
			Employee temp=null;
			Iterator <Employee>itr = list.iterator();
	        while(itr.hasNext()){
	        	temp=(Employee)itr.next();
	            if(temp.empid==empid){
	               	break;
	            }
	        }
	        if(temp==null)
	        	System.out.print("no record found for empid:"+empid);
	        else{
	        	list.remove(temp);
	        	System.out.print("\n below record removed from container");
	        	temp.getEmployeeDetails();
	        }
	        
			
		}
		
		public void displayAllEmployees(){
			
			Iterator <Employee>itr = list.iterator();
	        while(itr.hasNext()){
	            ((Employee)itr.next()).getEmployeeDetails();
	            }
	       

		}
		
		public void modEmployee(int empid,String newname){
			
			Iterator <Employee>itr = list.iterator();
			Employee e=null;
			int i=0;
	        while(itr.hasNext()){
	        	e=(Employee)itr.next();
	            if(e.empid==empid){
	            	e.updateName(newname);
	            	break;
	            }
	        }
		}
}
