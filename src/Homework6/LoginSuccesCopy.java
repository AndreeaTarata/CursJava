package Homework6;

import java.util.Scanner;

public class LoginSuccesCopy {

	public static void main(String[] args) {
		
		String userValid = "TestUser";
        int passValid = 1234;
        int maxAttempts = 3;
        int attempts = 0;

        Scanner scanner = new Scanner(System.in);

        while (attempts < maxAttempts) {
            System.out.print("Introduceti numele de utilizator: ");
            String userInput = scanner.next();

            System.out.print("Introduceti parola: ");
            int passInput = scanner.nextInt();

            if (userInput.equals(userValid) && passInput == passValid) {
                System.out.println("Logare cu succes!");
                break;
            } else {
                System.out.println("Eroare la logare.");
                attempts++;
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("Numărul maxim de încercări a fost atins. Utilizator blocat.");
        }

        scanner.close();
    }
}


