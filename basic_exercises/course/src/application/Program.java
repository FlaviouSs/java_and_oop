package application;

import java.util.Locale;
import java.util.Scanner;

import entities.product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		product x = new product();
		
		System.out.println("Enter product data: ");
		System.out.printf("Name: ");
		x.name = scan.nextLine();
		System.out.printf("Price: ");
		x.price = scan.nextDouble();
		System.out.printf("Quantity in stock: ");
		x.quantity = scan.nextInt();
		System.out.println();
		System.out.println("Product data: " + x);
		System.out.println();
		System.out.printf("Enter the number of products to be added in stock: ");
		int value =  scan.nextInt();
		x.addProducts(value);
		System.out.println();
		System.out.println("Update data: " + x);
		System.out.println();
		System.out.printf("Enter the number of products to be removed from stock: ");
		value =  scan.nextInt();
		x.removeProducts(value);
		System.out.println();
		System.out.println("Update data: " + x);
		System.out.println();

		scan.close();
	}

}
