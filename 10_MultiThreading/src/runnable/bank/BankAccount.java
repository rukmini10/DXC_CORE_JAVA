package runnable.bank;

public class BankAccount {
	private double accountBalance;

	public double getAccountBalance() {
		return accountBalance;
	}
	
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankAccount(double accountBalance) {
		super();
		this.accountBalance = accountBalance;
	}

	public synchronized void depositeAmount(double amount)throws RuntimeException {
		if(amount<100) {
			throw new RuntimeException("\nMinimum deposite amount must 100..");
		}
		accountBalance=accountBalance+amount;
	}
	
	public synchronized void withdrawAmount(double amount) throws RuntimeException{
		if(accountBalance-amount<1000) {
			throw new RuntimeException("Withdraw unsuccessful because of unsifficient balance...");
		}
		
		accountBalance=accountBalance-amount;
	}
	
	public synchronized void transfer(double amount,BankAccount target) {
		try {
		this.withdrawAmount(amount);
		target.depositeAmount(amount);
		}catch(RuntimeException e) {
			e.printStackTrace();
		}
	}
	
}
