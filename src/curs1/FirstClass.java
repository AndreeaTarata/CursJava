package curs1;


//one line comment
/*
 * multiple
 * line
 * comment
 */
//CamelCase
//UpperCamelCase --> clase
//lowerCamelCase --> metode si variabile
public class FirstClass {

	public static void main(String[] args) {
		

		System.out.println("Test");
		FirstClass obiect = new FirstClass();
		obiect.trimiteMesaj();
		//obiect.trimiteSMS();
		trimiteSMS();
	}
	
	public static void trimiteSMS() {
		System.out.println("SMS");
	}
	public void trimiteMesaj() {
		System.out.println("mesaj");
		
	}

}

/* 
 * CLASA Tester() -> OBIECT1, Ob 2, Ob 3 (refolosim cod)
 * 
 * public class Tester(){
 //declarare
 * String nume;
 * static String prenume;
 * 
 * }
 * Tester ion = new Tester();
 * ion.prenume = "Ionut"
 * Tester Maria = new Tester();
 * maria.prenume - "Elena"
 * 
 * 
 */