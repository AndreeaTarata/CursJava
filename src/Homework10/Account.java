package Homework10;

public class Account {
	
	static int amountDraw;
	private int accountNumber;
	static int balance;
	public Customer accountOwner;
	static int newBalance;
	
	public void SavingAccounts(int accountNumber, int balance, Customer accountOwner) {

		this.accountNumber = accountNumber;
		Account.balance = balance;
		
	
		
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void withdraw() throws InsufficientFundsException {
		
		
		newBalance = balance - amountDraw;
		balance = newBalance;
		System.out.println(balance);
		
		if(balance <= 0) {
			
			
			throw new InsufficientFundsException("Insuficient funds for transaction");
		
		}
		
	}

}
