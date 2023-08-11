package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double avarage = 0.00;
		int n = scan.nextInt();
		double[] vector = new double[n];
		
		for(int k = 0; k < n; k++) {
			vector[k] = scan.nextDouble();
		}
		
		for(int k = 0; k < n; k++) {
			avarage += vector[k];
		}
		
		avarage /= 3;
		
		System.out.printf("AVAREGE HEIGHT = %.2f", avarage);
		
		scan.close();
	}

}
