package Homework10;

import java.util.Scanner;

public class TestSavingAccount {

	

	private static final String Savingsaccount = null;

	public static void main(String[] args) throws InsufficientFundsException {

		Customer customer = new Customer("Ion", "adresa", "ion@email.com");
		SavingAccounts savingsaccount = new SavingAccounts(123456, 3000, customer);
		
		System.out.println("Buna" + customer.getName());

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the amount to widraw");
		Account.amountDraw = scan.nextInt();
		
		
		try {
			savingsaccount.withdraw();
			
			
		} catch (InsufficientFundsException e) {
			
			e.printStackTrace();
		}
		
		

	
	}
}
//throw new InsufficientFundsException("Insuficient funds for transaction");