/**
 * 
 */
package Curs6;

import java.util.Scanner;

/**facem un program care valideaza o parola pe baza unor reguli
 * reguli:
 * 1. parola trebuie sa fie minim 10 caractere
 *  2.parola trebuie sa contina un Uppercase
 *  3. parola nu trebuie sa fie la fel ca username
 *  Intrebam utilizator un username si o parola
 *  il informam care sunt reguliel parolei
 *  daca parola este valida atunci printam parola valida atunci printam "parola valida"
 *  daca parola nu este valida il intrebam din nou si il informa care sunt regulile care nu au fost respectate
 *   
 *   
 *   Metode
 *   - introducere user x
 *   - introducere parola x
 *   - printare reguli
 *   - validare reguli
 *   - validare parola
 *   
 *   */
public class PasswordValidator {
	
	String username;
	//String pass;
	Scanner scan = new Scanner(System.in);
	boolean valid = true;
	public void getUserName() {
		System.out.println("Introdu username:");
		
		username = scan.next();
		
	}
	public String getPassword() {
		System.out.println("Introdu pass:");
		String pass = scan.next();
		return pass;//returnez o valoare de aia String, nu are nevoie de obiect
		
	}
	public void printPasswordRules() {
		System.out.println("Reguli parola:");
		System.out.println("parola trebuie sa fie minim 10 caractere");
		System.out.println("parola trebuie sa contina un Uppercase");
		System.out.println("parola nu trebuie sa fie la fel ca username");
	}
	public void checkPassRules(String pass) {
		valid = true;
		
		if(pass.length()<10) {
			System.out.println("parola trebuie sa fie minim 10 caractere");
			valid = false;
		}
			
		if(pass.equals(pass.toLowerCase())) {
		System.out.println("parola trebuie sa contina un Uppercase");
		valid = false;
			}
		if(pass.equals(username)) {
		System.out.println("parola nu trebuie sa fie la fel ca username");
			}
		}
	
		
	public void validatePassword() {
		do {
			checkPassRules(getPassword());
			
		}while(!valid);
			
		
			
		
		
	}

}
