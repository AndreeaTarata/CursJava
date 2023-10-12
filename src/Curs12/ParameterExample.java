package Curs12;

public class ParameterExample {

	public static void main(String[] args) {

		// obj.executeScript("script js", element);
		// obj.executeScript("script js", element, element2);
		// obj.executeScript("script js", element, element2, element3);
		printDetails("unu", "doi");
		printDetails("unu", "doi", "trei");
		printDetails("unu", "doi", "patri", "cincni");

	}

	public static void printDetails(String...value) { //vararg - argumente variabile
		
		for(String element : value) {
			System.out.println(element);
		}
	}

	public static void printDetails(int nr, boolean flag, String... value) { // vararg - argumente variabile

		for (String element : value) {
			System.out.println(element);
		}
	}

	/*
	 * public static void printDetails(String str1, String str2) {
	 * System.out.println(str1 + str2); }
	 */
}
