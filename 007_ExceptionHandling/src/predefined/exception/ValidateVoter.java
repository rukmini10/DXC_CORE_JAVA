package predefined.exception;

public class ValidateVoter {
	private String voterName;
	private int voterAge;
	

public String getVoterName() {
		return voterName;
	}



	public void setVoterName(String voterName) {
		this.voterName = voterName;
	}



	public int getVoterAge() {
		return voterAge;
	}
	public void setVoterAge(int voterAge) {
		this.voterAge = voterAge;
	}


	public ValidateVoter() {
		super();
		// TODO Auto-generated constructor stub
	}



	public ValidateVoter(String voterName, int voterAge) {
		super();
		this.voterName = voterName;
		this.voterAge = voterAge;
	}



	@Override
	public String toString() {
		return "\nvoterName=" + voterName + ", voterAge=" + voterAge ;
	}



	



public String checkVoter() {
	String errormessage=null;
	String validmessage=null;
	try {
		if(voterAge<18) {
			errormessage="\nHi " +this.getVoterName()+ ", play and enjoy";
			throw new Exception(errormessage);
		}else if(voterAge>120) {
			errormessage="\nHi " +this.getVoterName()+ ", please check you age which is not applicable";
			throw new Exception(errormessage);
		}
	
		else {
			validmessage="\nHi " +this.getVoterName()+ ", please do vote";
		}
	
	}catch(Exception e) {
		System.err.println(e.getMessage());
	}
	return validmessage;
	
	}
}
