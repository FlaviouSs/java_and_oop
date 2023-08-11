package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scan =  new Scanner(System.in);
		
		System.out.printf("How many numbers you'll type? ");
		int n = scan.nextInt();
		
		double[] vect = new double[n];
		
		for(int k = 0; k < n; k++) {
			System.out.printf("Type a number: ");
			vect[k] = scan.nextDouble();
		}
		
		System.out.println("Negative Numbers:");
		
		for(int k = 0; k < n; k++) {
			if(vect[k] < 0)
				System.out.printf("%.0f%n", vect[k]);
		}
		
		scan.close();

	}

}
