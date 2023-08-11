package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		int m, n, x;
		
		System.out.printf("Type the number o M lines and N columns: ");
		
		m = scan.nextInt();
		n = scan.nextInt();
		
		int[][] matriz = new int[m][n];
		
		System.out.println("");
		
		for(int k = 0; k < m; k++) {
			for(int j = 0; j < n; j++) {
				matriz[k][j] = scan.nextInt();
			}
		}
		
		System.out.println("");
		
		x = scan.nextInt();
		
		for(int k = 0; k < m; k++) {
			for(int j = 0; j < n; j++) {
				if(matriz[k][j] == x) {
					System.out.printf("Position %d,%d%n", k, j);
					if (j > 0) {
						System.out.println("Left: " + matriz[k][j - 1]);
					}
					if (k > 0) {
						System.out.println("Up: " + matriz[k - 1][j]);
					}
					if (j < matriz[k].length-1) {
						System.out.println("Right: " + matriz[k][j + 1]);
					}
					if (k < matriz.length-1) {
						System.out.println("Down: " + matriz[k + 1][j]);
					}
				}
			}
		}
		
		
		
		scan.close();
	}

}
