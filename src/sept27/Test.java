package sept27;

public class Test {
	public static void main (String[] args) {
		Account myAccount = new Account (1122, 2000);
		myAccount.setAnnualInterestRate(4.5);
		
		myAccount.setId(1234);
		
		myAccount.withdraw(2500);
		myAccount.deposit(3000);
		System.out.println("Balance is " + myAccount.getBalance());
		System.out.println("ID is " + myAccount.getId());
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
