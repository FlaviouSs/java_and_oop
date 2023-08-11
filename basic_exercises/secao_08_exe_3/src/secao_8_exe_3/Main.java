package secao_8_exe_3;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Student student = new Student();
		
		System.out.println("Type the student's name and grandes: ");
		student.student_name = scan.nextLine();
		student.grade1 = scan.nextDouble();
		student.grade2 = scan.nextDouble();
		student.grade3 = scan.nextDouble();
		System.out.println();
		student.finalGradeSituation();
		
		scan.close();
	}

}
