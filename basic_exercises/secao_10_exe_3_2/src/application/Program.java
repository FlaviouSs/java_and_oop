package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("How many number you'll type? ");
		int n = scan.nextInt();
		
		double[] vect = new double[n];
		
		for(int k = 0; k < n; k++) {
			System.out.printf("Type a number: ");
			vect[k] = scan.nextDouble();
		}
		
		double sum = 0.00, average;
		
		System.out.println();
		
		System.out.printf("VALUES = ");
		
		for(int k = 0; k < n; k++) {
			System.out.printf("%.1f ", vect[k]);
			sum += vect[k];
		}
		
		System.out.println();
		System.out.printf("SUM = %.2f%n", sum);
		average = sum / n;
		System.out.printf("AVERAGE = %.2f%n", average);

		scan.close();
	}

}
