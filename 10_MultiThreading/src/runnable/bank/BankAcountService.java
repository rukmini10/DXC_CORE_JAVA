package runnable.bank;
public class BankAcountService {
	public static void main(String[] args) {
		BankAccount account1=new BankAccount(5500);
		System.out.print("\nCurrent Account1 balance :"+account1.getAccountBalance());
		BankAccount account2=new BankAccount(5500);
		System.out.print("\nCurrent Account2 balance :"+account2.getAccountBalance());
		account1.transfer(200, account2);
		System.out.print("\nCurrent Account1 balance :"+account1.getAccountBalance());
		account1.depositeAmount(2000);
		System.out.print("\nCurrent Account1 balance :"+account1.getAccountBalance());
		account2.withdrawAmount(1500);
		System.out.print("\nCurrent Account2 balance :"+account2.getAccountBalance());
		account2.transfer(200, account1);
		System.out.print("\nCurrent Account1 balance :"+account1.getAccountBalance());
		System.out.print("\nCurrent Account2 balance :"+account2.getAccountBalance());
	}

}
