/*
write java code to create student class having rollNumber, name, marks as value
and rollno as key 
do some search operation-based on rollno whether object is found or not
*/
package map;

import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

class Studentdata {
	private String name;
	private int rollNumber;
	private double marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public Studentdata() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Studentdata(String name, int rollNumber, double marks) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "\n"+name + "," + rollNumber + "," + marks ;
	}
	@Override
	public int hashCode() {
		return Objects.hash(marks, name, rollNumber);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Studentdata other = (Studentdata) obj;
		return Double.doubleToLongBits(marks) == Double.doubleToLongBits(other.marks)
				&& Objects.equals(name, other.name) && rollNumber == other.rollNumber;
	}
}


public class Student {
public static void printHashMap(HashMap<Integer,Studentdata> map) {
Set<Integer> keys=map.keySet();	
System.out.println(keys);
//enhance for loop
for(Integer i:keys) {
	System.out.println("\n "+i +"=>"+map.get(i));
}
}
	public static void main(String[] args) {
		HashMap<Integer,Studentdata> map=new HashMap<Integer,Studentdata>();
		map.put(1,new Studentdata("Rukmini",10298,89));
		map.put(2,new Studentdata("Atheeq",10299,79));
		map.put(3,new Studentdata("Pranav",10300,90));
		map.put(4,new Studentdata("spandana",10301,85));
		
		
		System.out.println(map);
		if (map.containsKey(10298)) {
			 
           
           Studentdata a = map.get(10298);
 
            // Printing value fr the corresponding key
            System.out.println("Object found..."+a);
        }
		
		printHashMap(map);
		
	
}
}