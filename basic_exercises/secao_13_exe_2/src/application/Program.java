package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String department_name = scan.nextLine();
		
		System.out.print("Enter worker data:");
		System.out.print("Name: ");
		String worker_name = scan.nextLine();
		System.out.print("Level: ");
		String worker_level = scan.nextLine();
		System.out.print("Base salary: ");
		Double worker_base_salary = scan.nextDouble();
		
		Worker worker = new Worker(worker_name, WorkerLevel.valueOf(worker_level), worker_base_salary, new Department(department_name));
		
		System.out.println();
		System.out.printf("How many contracts to this worker? ");
		int n_contracts = scan.nextInt();
		
		for(int i = 0; i < n_contracts; i++) {
			System.out.println("ENTER CONTRACT " + (i + 1) + " DATA:");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contract_date = sdf.parse(scan.next());
			System.out.print("Value per hour: ");
			double valuePerHour = scan.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = scan.nextInt();
			HourContract contract = new HourContract(contract_date, valuePerHour, hours);
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.print("Enter moth and year to calculate income (MM/YYYY): ");
		String month_and_year = scan.next();
		int month = Integer.parseInt(month_and_year.substring(0, 2));
		int year = Integer.parseInt(month_and_year.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + month_and_year + ": " + String.format("%.2f",worker.income(year, month)));
		
		scan.close();
	}

}
