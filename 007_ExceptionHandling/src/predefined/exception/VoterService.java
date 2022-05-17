package predefined.exception;

public class VoterService {
public static void main(String[] args) {
	ValidateVoter voter=new ValidateVoter("Rukmini",22);
	System.out.println(voter.checkVoter());
	voter=new ValidateVoter("pranav",17);
	System.out.println(voter.checkVoter());
}
}
