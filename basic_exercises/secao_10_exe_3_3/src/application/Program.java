package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pearson;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("How many people are gonna be type? ");
		int n = scan.nextInt();
		
		Pearson[] pearson_vect = new Pearson[n];
		
		for(int k = 0; k < n; k++) {
			scan.nextLine();
			System.out.println((k + 1) + " st pearson data:");
			System.out.printf("Name: ");
			String name = scan.nextLine();
			System.out.printf("Age: ");
			int age = scan.nextInt();
			System.out.printf("Height: ");
			double height = scan.nextDouble();
			
			pearson_vect[k] = new Pearson(name, age, height);
		}
		
		double average_height = 0;
		
		for(int k = 0; k < n; k++) {
			average_height += pearson_vect[k].getHeight();
		}
		
		average_height /= n;
		
		System.out.println();
		
		System.out.printf("Average height: %.2f%n", average_height);
		
		double under_sixteen_age = 0.00;
		int aux_under_age = 0;
		
		
		for(int k = 0; k < n; k++) {
			if(pearson_vect[k].getAge() < 16)
				aux_under_age += 1;
		}
		
		under_sixteen_age = (aux_under_age * 100) / n;
		
		System.out.printf("Under 16 years old people: %.1f%%%n", under_sixteen_age);
		
		for(int k = 0; k < n; k++) {
			if(pearson_vect[k].getAge() < 16)
				System.out.println(pearson_vect[k].getName());
		}
		
		
		scan.close();
	}

}
