package entities;

public class Student {
	public String student_name;
	public double grade1, grade2, grade3;
	
	public void finalGradeSituation() {
		double aux = grade1 + grade2 + grade3;
		System.out.printf("FINAL GRADE = %.2f%n", aux);
		if(aux >= 60.00) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", 60.00 - aux);
		}
	}
}
