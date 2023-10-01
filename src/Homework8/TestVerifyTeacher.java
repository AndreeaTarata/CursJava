package Homework8;

public class TestVerifyTeacher {

	public static void main(String[] args) {
		
		Qualification seCalificaTeacher1 = new Qualification("Python", 2, "Morning");
		seCalificaTeacher1.verify();
		Qualification seCalificaTeacher2 = new Qualification("Java", 2, "Morning");
		seCalificaTeacher2.verify();
		Qualification seCalificaTeacher3 = new Qualification("Java", 4, "Afternoon");
		seCalificaTeacher3.verify();
		Qualification seCalificaTeacher4 = new Qualification("Python", 3, "Afternoon");
		seCalificaTeacher4.verify();

	}

}
