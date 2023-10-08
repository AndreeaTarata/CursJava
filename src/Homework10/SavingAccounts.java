package Homework10;

public class SavingAccounts extends Account{
	
	
	public SavingAccounts(int accountNumber, int balance, Customer accountOwner) {

	setAccountNumber(accountNumber);
	Account.balance = balance;
	super.accountOwner = accountOwner;
	//Account.newBalance = newBalance;
	
	System.out.println(newBalance);
	
	}
	public void withdraw() throws InsufficientFundsException {
		
		
		newBalance = balance - amountDraw;
		balance = newBalance;
		if (balance > 0) {
			
	
			System.out.println("Please pick your money!");
			System.out.println("Your new balance is" + balance);
			System.out.println("Thank you for using our ATM");
			
			

		} else {
		
			System.out.println("The amount you entered is greater than the available balance :" + balance);
			System.out.println("Thank you for using our ATM");
			throw new InsufficientFundsException("Insuficient funds for transaction");
		}
		
		
}

}