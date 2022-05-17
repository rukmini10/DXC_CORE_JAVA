package objectserialization;


import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ObjectToStreamConverter {
public void writePerson(String fileName) {
	//creating reference of ObjectOutputStream outputStream=null;
	ObjectOutputStream outputStream=null;
	try {
		outputStream=new ObjectOutputStream(new FileOutputStream(fileName));
		Person person=new Person();
		// class reference new constructor//default constructor
		person.setFirstName("Rukmini");
		person.setLastName("Chebrolu");
		person.setAge(22);
		//now serializing object in to stream
		outputStream.writeObject(person);
		
		
		person.setFirstName("Roshini");
		person.setLastName("Chebrolu");
		person.setAge(22);
		//now serializing object in to stream
				outputStream.writeObject(person);
		
		
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException ex) {
		ex.printStackTrace();
	}finally {
		try {
			if(outputStream!=null) {
				outputStream.flush();
				outputStream.close();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}

public void readPerson(String fileName) {
	//creating reference of ObjectOutputStream outputStream=null;
	ObjectInputStream inputStream=null;	
	try {
		inputStream=new ObjectInputStream(new FileInputStream(fileName));
		Object obj=null;
	while((obj=inputStream.readObject())!=null);
	{
		if(obj instanceof Person) {
			System.out.println(obj.toString());
		}
	
	}

	}catch(EOFException e1) {
		System.err.println("End of file reached");
	}

	catch(ClassNotFoundException e2) {
		e2.printStackTrace();
	}catch(IOException e3){
		e3.printStackTrace();
	}finally {
		try {
			if(inputStream!=null) {
				
				inputStream.close();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
}







