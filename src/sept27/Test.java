package sept27;

public class Test {
	public static void main (String[] args) {
		Account account = new Account (1122, 2000);
		account.setAnnualInterestRate(4.5);
		
		account.setId(1234);
		
		account.withdraw(2500);
		account.deposit(3000);
		System.out.println("Balance is " + account.getBalance());
		System.out.println("ID is " + account.getId());
	}
}

class Account {
	private int id;
	private double balance; 
	private double annualInterestRate;
	
	public Account () {
		this.id=0;
		this.balance=0;
		this.annualInterestRate=0;
	}
	
	
	public Account (int id, double balance) {
		this.id=id;
		this.balance=balance;
	}
	
	public int getId() {
		return id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	
	public void setId(int id) { 
		this.id=id;
	}
	
	public void setBalance(double balance) { 
		this.balance=balance;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) { 
		this.annualInterestRate=annualInterestRate;
	}
	
	
	public void withdraw(double n) {
		balance = balance - n ;
	}
	
	public void deposit(double n) {
		balance = balance + n  ;
	}

}
