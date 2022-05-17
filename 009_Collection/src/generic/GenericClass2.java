package generic;
class Person {
	private String firstName;
	private String lastName;
	private String contactNumber;
	private int age;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person() {
	}
	public Person(String firstName, String lastName, String contactNumber, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNumber = contactNumber;
		this.age = age;
	}
	@Override
	public String toString() {
		return "\n" + firstName + ", " + lastName + ", " + contactNumber+ ", " + age;
	}
}
public class GenericClass2 {
	//generic method
	public <T> void printData(T data) {
		System.out.println("Data is :"+data);
	}
	public static void main(String[] args) {
		GenericClass2 generic=new GenericClass2();
		generic.printData(111);
		generic.printData("India");
		Person person=new Person("Kakumani","Pavan","1223344556",23);
		generic.printData(person);
	}
}
