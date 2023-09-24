package Curs6;

public class TestPassValidator {

	public static void main(String[] args) {
		
		PasswordValidator validator = new PasswordValidator();
		validator.printPasswordRules();
		//validator.getUserName();
		validator.validatePassword();
		
		System.out.println("Parola valida");

	}

}
