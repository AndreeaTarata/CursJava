package Homework7;

public class Duplicate {

	public static void main(String[] args) {

		Duplicate obj = new Duplicate();
		obj.numaraDuplicate();
	}

	public void numaraDuplicate() {

		String[] myStringArray = { "Maria", "Bob", "Ion", "George", "Oana", "Bogdan", "Oana", "Ion" };

		for (int i = 0; i <= myStringArray.length-1; i++) {
			// System.out.println(myStringArray[i]);
			System.out.println(myStringArray[i+1]);

			/*while (myStringArray[i].equals(myStringArray[i+1])) {

				*/System.out.println(myStringArray[i]);

			}

		}
	}

