package runnable.bank;

public class BankTransaction {

	public static void main(String[] args) {
		BankAccount account1=new BankAccount(5500);
		System.out.print("\nCurrent Account1 balance :"+account1.getAccountBalance());
		BankAccount account2=new BankAccount(5500);
		System.out.print("\nCurrent Account2 balance :"+account2.getAccountBalance());
		Thread thread1=new Thread(new MoneyTransfer(account1, account2, 2000));
		Thread thread2=new Thread(new MoneyTransfer(account2, account1, 1500));
		thread1.setName("A");
		thread1.start();
		thread2.setName("B");
		thread2.start();

	}

}
