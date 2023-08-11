package secao_8_exe_1;

import java.util.Scanner;
import java.util.Locale;
import entities.Rectangle;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle widht and height:");
		rectangle.widht = scan.nextDouble();
		rectangle.height = scan.nextDouble();
		System.out.printf("AREA = %.2f%n", rectangle.area());
		System.out.printf("PERIMETER = %.2f%n", rectangle.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rectangle.diagonal());
		
		scan.close();
	}

}
