package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("How many students are gonna be typed? ");
		int n = scan.nextInt();
		
		Student[] students_vector = new Student[n];
		
		for(int k = 0; k < n; k++) {
			System.out.println("Type the name, first and second grades of the " + (k + 1) + "st student:");
			scan.nextLine();
			String name = scan.nextLine();
			double first_grade = scan.nextDouble();
			double second_grade = scan.nextDouble();
			students_vector[k] = new Student(name, first_grade, second_grade);
		}
		
		System.out.println("Approved Students:");
		for(int k = 0; k < n; k++) {
			double aux1 = students_vector[k].getGrade_first_semester();
			double aux2 = students_vector[k].getGrade_second_semester();
			if(((aux1 + aux2) / 2.0) >= 6.0)
				System.out.println(students_vector[k].getName());
		}
		

		scan.close();
	}

}
