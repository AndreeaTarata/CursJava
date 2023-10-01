package Curs8;

public class TestMostenire {

	public static void main(String[] args) {
		
		
		//Angajat -->  Tester -->  TesterAutomat - lant de mostenire
		
		TesterAutomat testerAutomat = new TesterAutomat();
		

 // vine din clasa tester automat
		testerAutomat.setProgrammingLanguage("Java");
		testerAutomat.setDepartment("QA"); // vine din clasa tester
		testerAutomat.setSeniority("Junior"); // vine din clasa tester;
		testerAutomat.setEmail("bob@bob.com"); // vine din clasa angajat
		testerAutomat.setNume("Bob"); // vine din clasa angajat;, testautomat e un obiect care are disponibil in fct lui alte 
		System.out.println(testerAutomat);

	}

}
