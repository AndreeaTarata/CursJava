package Curs2;

public class StaticExample {
	
	String nume = "Andreea";
	static String prenume;
	
	
	String varsta;//declararea unei variabile
	//varsta = "24";// initializarea unei variabile, acea valoare null care era atribuita pt ca era default a fost inl cu 24
	String masina = "Dacia";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StaticExample obj1 = new StaticExample();
		obj1.nume = "Maria";
		obj1.prenume = "Ioana";
		
		
		StaticExample obj2 = new StaticExample();
		obj2.nume = "Alina";
		obj2.prenume = "Carmen";
		
		
		System.out.println(obj1.nume);
		System.out.println(obj1.prenume);
		
	}

}
