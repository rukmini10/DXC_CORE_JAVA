/*
plan old java object
it includes only private classes
setters to set the values/initialising purpose
getters to get a or display data
and toString
 */


package pojoclass;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	private static int id=1000;
private int personId;
private String name;
private String contactNumber;
public static int getId() {
	return id;
}

public int getPersonId() {
	return personId;
}
public void setPersonId(int personId) {
	this.personId = personId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getContactNumber() {
	return contactNumber;
}
public void setContactNumber(String contactNumber) {
	this.contactNumber = contactNumber;
}
public Person() {
	super();
	// TODO Auto-generated constructor stub
}
public Person(String name, String contactNumber) {
	super();

	this.name = name;
	this.contactNumber = contactNumber;
	this.personId=id++;
}



@Override
//returning integers values
public int hashCode() {
	return Objects.hash(contactNumber, name, personId);
}
//it is comparing 
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Person other = (Person) obj;
	return Objects.equals(contactNumber, other.contactNumber) && Objects.equals(name, other.name)
			&& personId == other.personId;
}
@Override
public String toString() {
	return "\n"+personId + ", " + name + ", " + contactNumber;
}



}
