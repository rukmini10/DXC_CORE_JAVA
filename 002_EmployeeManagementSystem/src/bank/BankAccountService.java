package bank;
import java.util.Scanner;




public class BankAccountService {

	
    public static int withDrawAmount()
    {
        Scanner sc=new Scanner(System.in);
        int w;
        do
        {
            System.out.println("Enter amount to be withdrawn:");
            w=sc.nextInt();
            if(w<=0)
            System.out.println("Amount should be positive");
        }
        while(w<=0);
        return w;
    }	
	
	 
    public static int depositAmount() {  
        int balanceAmount;  
        int depositAmount;
        System.out.println("Enter the amount you want to deposit: ");  
        Scanner sc=new Scanner(System.in);
        depositAmount = sc.nextInt();  
        System.out.println("Amount you have deposited is :"+depositAmount);  
        return depositAmount;
     
        
    }

	public static void main(String[] args) {
		
		BankAccount bank=new BankAccount("1845455" ,"Rukmini","9505918828",84565,"IndianBank");
		System.out.println(bank);
		
		int c=withDrawAmount();
        int x=depositAmount();
	
	}
}