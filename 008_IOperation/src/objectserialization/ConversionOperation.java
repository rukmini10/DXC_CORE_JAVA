package objectserialization;

public class ConversionOperation {

	public static void main(String[] args) {
		ObjectToStreamConverter converter=new ObjectToStreamConverter();
		converter.writePerson("personfile.txt");
		System.out.println("Person Object has been serialized successfully...");
		
		converter.readPerson("personfile.txt");
		System.out.println("Person Object has been de-serialized successfully...");
		
	}

}
