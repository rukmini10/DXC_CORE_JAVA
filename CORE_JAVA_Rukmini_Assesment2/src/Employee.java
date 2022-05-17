import java.util.Vector;

public class Employee {
private int empid;
private String empname,address;
public Employee(int empid, String empname, String empaddress) {
super();
this.empid = empid;
this.empname = empname;
this.address = empaddress;
}
public int getEmpid() {
return empid;
}
public void setEmpid(int empid) {
this.empid = empid;
}
public String getEmpname() {
return empname;
}
public void setEname(String empname) {
this.empname = empname;
}
public String getAddress() {
return address;
}
public void setAddress(String empaddress) {
this.address = empaddress;
}
}


