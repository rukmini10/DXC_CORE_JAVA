package multilevel;

public class Director extends Employee{
	private String directorType;

	public String getDirectorType() {
		return directorType;
	}

	public void setDirectorType(String directorType) {
		this.directorType = directorType;
	}

	public Director() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Director(int empid, String firstName, String lastName, String contactNumber, double salary
			,String directorType) {
		super(empid, firstName, lastName, contactNumber, salary);
		this.setDirectorType(directorType);
	}

	@Override
	public String toString() {
		return "\n"+super.toString()+"\tdirectorType=" + directorType;
	}
	
	
	
}
