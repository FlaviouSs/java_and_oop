package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.WithdrawException;

public class Program {
	public static void main(String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		System.out.print("Initial Balance: ");
		Double initial_balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		Double withdraw_limit = sc.nextDouble();
		
		Account account = new Account(number, holder, initial_balance, withdraw_limit);
		
		System.out.println();
		try {
			System.out.print("Enter amount for withdraw: ");
			Double amount = sc.nextDouble();
			account.withdraw(amount);
			System.out.println("New Balance: " + account.getBalance());
		}
		catch(WithdrawException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		
		sc.close();
	}
}
