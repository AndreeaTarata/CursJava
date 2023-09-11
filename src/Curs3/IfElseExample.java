package Curs3;

import java.util.Scanner;

/*
 * Facem un program care verifica daca autentificarea e corecta
 * User : Test
 * Pass : 1234
 * daca auth este corect printam printam login -succesfull
 * daca auth este gresit - printam username sau parola --> gresita
 */

public class IfElseExample {

	public static void main(String[] args) {
		
		
		String inputUsername;
		int inputPassword;
		
		
		String user = "Test";
		int pas = 1234;
		
		System.out.println("Te rog introdu username: ");
		Scanner scan = new Scanner(System.in);
		inputUsername = scan.next();
		//System.out.println(inputUsername);
		System.out.println("Te rog introdu o parola: ");
		inputPassword = scan.nextInt();
		
		
		/* 
		 * if(conditie booleanu (true sau false)) {
		 *codul din corpul lui if se execita daca cond din if este indeplinita (adica pe True), daca nu este -> else (adica rez pe False)
		 *In JAVA = E FOLOSESTE EQUALS (metoda a clasei string)
				}else {
			
		*}
		*/
		// && - AND, || OR
		
		if ((inputUsername.equals(user)) && (inputPassword == pas)) {
			System.out.println("Login sucessfull!");
					
		}else {
			System.out.println("Username or password is wrong!");
		}
	}

}
