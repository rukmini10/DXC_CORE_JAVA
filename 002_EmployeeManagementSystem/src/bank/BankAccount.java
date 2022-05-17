package bank;

public class BankAccount {
	private String accountNumber;
	private String accountHolderName;
	private String contactNumber;
	private int balanceAmount;
	private String bankName;
	
	

	public BankAccount(String accountNumber,String accountHolderName,String contactNumber,int balanceAmount,String bankName) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.contactNumber = contactNumber;
		this.balanceAmount = balanceAmount;
		this.bankName = bankName;
	}

	@Override
	public String toString() {
		return "\naccountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName+ ", "
				+ "contactNumber=" + contactNumber + ", balanceAmount=" + balanceAmount + ", bankName=" + bankName;
	
	}
	public String showAccountDetail() {
		return accountHolderName;
	
	}
	public int balanceAmount() {
		return(this.balanceAmount);
	}
	
    public boolean withDrawAmount(int w)
    {
        if(balanceAmount()<w)
        {
            System.out.println("Sorry!!! No enough balance");
            return false;
        }
        else
        {
            System.out.println("Balance amount after withdraw: "+(balanceAmount()-w));
            return true;
        }
    }
    
    
    
  
   
}

		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


