package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		
		Product[] vect = new Product[n];
		
		for(int k = 0; k < n; k++) {
			scan.nextLine();
			String name = scan.nextLine();
			double price = scan.nextDouble();
			vect[k] = new Product(name, price);
			
		}
		
		double sum = 0.0;
		
		for(int k = 0; k < n; k++){
			sum += vect[k].getPrice();
		}
		
		double average = sum / n;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", average);
		
		scan.close();
	}

}
