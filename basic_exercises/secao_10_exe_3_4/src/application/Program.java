package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("How many numbers you're gonna type? ");
		int n = scan.nextInt();
		
		int[] vect = new int[n];
		
		for(int k = 0; k < n; k++) {
			System.out.printf("Type a number: ");
			vect[k] = scan.nextInt();
		}
		
		System.out.println();
		
		int aux = 0;
		
		System.out.println("EVEN NUMBERS:");
		for(int k = 0; k < n; k++) {
			if((vect[k] % 2) == 0) {
				System.out.printf("%d ", vect[k]);
				aux++;
			}
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("EVEN AMOUNT = " + aux);
		
		scan.close();
	}

}
