package finalclass;

final public class DxcProfile {
private String companyProfile;
private int numberofHead;
private String companyType;

public String getCompanyProfile() {
	return companyProfile;
}
public int getNumberofHead() {
	return numberofHead;
}
public String getCompanyType() {
	return companyType;
}
@Override
public String toString() {
	return "DxcProfile =>" + companyProfile + "," + numberofHead + ","
			+ companyType ;
}
public DxcProfile(String companyProfile, int numberofHead, String companyType) {
	super();
	this.companyProfile = companyProfile;
	this.numberofHead = numberofHead;
	this.companyType = companyType;
}


}
