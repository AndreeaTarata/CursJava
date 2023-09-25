package Homework6;

import java.util.Scanner;

public class LoginSucessful {

// input user si parola
// 3 incercari de logare
// "Maximum attempts reached. User Blocked"
// pt fiecare incercare gresita "Login Error"
// vaid "Login Sucessgul"

	String username;
	int pass;
	int nrIncercari = 1;
	Scanner scan = new Scanner(System.in);
	boolean finish = false;
	boolean valid = false;

	public String getUserName() {
		System.out.println("Introdu username:");
		username = scan.next();
		scan.nextLine();
		return username;
	}

	public int getPassword() {
		System.out.println("Introdu pass:");
		int pass = scan.nextInt();

		return pass;
	}

	public void maxReach() {

		if (nrIncercari > 3) {
			System.out.println("Maximum attempts reached. User Blocked");
			finish = true;

		}
	}

	public void checkLogin(String username, int pass) {
		
		while (nrIncercari <= 3 && username.equals("Test") && pass == 1234) {
			System.out.println("Login Sucessful");
			nrIncercari++;
			valid = true;

			break;

		}

		while(nrIncercari <= 3 && !username.equals("Test") && pass != 1234 || username.equals("Test") && pass != 1234
				|| !username.equals("Test") && pass == 1234) {

			System.out.println("Login error");
			System.out.println(nrIncercari);
			
			username = getUserName();
			

			System.out.println(username);

			pass = getPassword();
			System.out.println(pass);
			nrIncercari++;

			maxReach();
		
	
		}
	}

	public void validatePassword() {

		do {
			checkLogin(getUserName(), getPassword());

		} while (!finish && !valid);

	}
}