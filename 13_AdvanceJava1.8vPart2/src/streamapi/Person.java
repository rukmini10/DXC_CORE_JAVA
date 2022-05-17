package streamapi;

public class Person {
	
		 private String firstName;
		 private String city;
		  private String contactNumber;
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getContactNumber() {
			return contactNumber;
		}
		public void setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
		}
		public Person(String firstName, String city, String contactNumber) {
			super();
			this.firstName = firstName;
			this.city = city;
			this.contactNumber = contactNumber;
		}
		public Person() {
			
		}
		@Override
		public String toString() {
			return "\n" +firstName + "," + city + "," + contactNumber ;
		}
		
		  
		  
}
