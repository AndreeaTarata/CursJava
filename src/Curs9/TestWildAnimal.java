package Curs9;

public class TestWildAnimal {

	public static void main(String[] args) {
		
		
		/*WildAnimal animal = new WildAnimal();
		animal.makeSound();
		
		System.out.println("______________________");
		
		Deer bamby = new Deer();
		bamby.makeSound();//metoda suprascrisa
		bamby.eatGrass();
		
		System.out.println("______________________");
		
		Lion simba = new Lion();
		simba.makeSound();//metoda suprascrisa Polimorfism
		simba.eatMeat();
*/
		
		//slenium - identifica ele si actioneaza asupra lor. este o librarie care controleaza un browser.
		
		//Webdriver browser = new ChromeDriver();
		WildAnimal simba = new Lion();
		simba.makeSound();
		//simba.eatMeat(); // nu exista
		((Lion) simba).eatMeat(); //Lion simba = new Lion(); cu comanda cast (click dreapta) POLIMORFISM PUR
		
		simba = new Deer(); // poate schima constructorul
		simba.makeSound();
		((Deer) simba).eatGrass();
		
	}

}
