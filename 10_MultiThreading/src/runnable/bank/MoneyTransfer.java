package runnable.bank;

public class MoneyTransfer implements Runnable{
	private BankAccount from,to;
	private double amount;
	
	

	public MoneyTransfer(BankAccount from, BankAccount to, double amount) {
		this.from = from;
		this.to = to;
		this.amount = amount;
	}
	@Override
	public void run() {
		System.out.println("\n before transaction from accout:"+from.getAccountBalance());
		System.out.println("\n before transaction to accout:"+to.getAccountBalance());
		from.transfer(amount, to);
		System.out.println("\n after transaction from accout:"+from.getAccountBalance());
		System.out.println("\n after transaction to accout:"+to.getAccountBalance());
		
	}

}
