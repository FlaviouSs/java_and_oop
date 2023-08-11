package secao_8_exe_2;

import java.util.Scanner;
import java.util.Locale;
import entities.Employee;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Employee employee = new Employee();
		
		System.out.printf("Name: ");
		employee.name =  scan.nextLine();
		System.out.printf("Gross salary: ");
		employee.gross_salary = scan.nextDouble();
		System.out.printf("Tax: ");
		employee.tax = scan.nextDouble();
		
		System.out.println();
		System.out.printf("Employee: " + employee.toString());
		System.out.println();
		System.out.printf("Wich percentage to increase salary? ");
		double aux = scan.nextDouble();
		employee.increaseSalary(aux);
		System.out.println();
		System.out.println("Update data: " + employee.toString());
		
		scan.close();
	}

}
