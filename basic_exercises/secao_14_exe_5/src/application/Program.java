package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list_employees = new ArrayList<>();
		
		
		System.out.print("Enter the number of employees: ");
		int aux = sc.nextInt();
		
		for(int k = 0; k < aux; k++) {
			System.out.printf("Employee #%d data:\n", k + 1);
			System.out.print("Outsourced (y/n)? ");
			char aux2 = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double value_ph = sc.nextDouble();
			if(aux2 == 'y') {
				System.out.print("Additional charge: ");
				double additional_charge = sc.nextDouble();
				list_employees.add(new OutsourcedEmployee(name, hours, value_ph, additional_charge));
			}
			
			else {
				list_employees.add(new Employee(name, hours, value_ph));
			}
			
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		for(Employee emp : list_employees) {
			System.out.printf("%s - $ %.2f\n",emp.getName(), emp.payment());
		}
		
		sc.close();
	}

}
