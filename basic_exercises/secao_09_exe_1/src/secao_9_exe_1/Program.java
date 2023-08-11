package secao_9_exe_1;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		Account account;
		
		System.out.printf("Enter account number: ");
		int aux_an = scan.nextInt();
		scan.nextLine();
		System.out.printf("Enter account holder: ");
		String aux_ah = scan.nextLine();
		System.out.printf("Is there a initial deposit (y/n)? ");
		char aux = scan.next().charAt(0);
		if(aux == 'y') {
			System.out.printf("Enter initial deposit value: ");
			double aux_idv = scan.nextDouble();
			account = new Account(aux_an, aux_ah, aux_idv);
		}else {
			account = new Account(aux_an, aux_ah);
		}
		
		System.out.println("Account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.printf("Enter deposit value: ");
		double aux_idv = scan.nextDouble();
		account.deposit(aux_idv);
		System.out.printf("Updated account data:%n");
		System.out.println(account);
		
		System.out.println();
		System.out.printf("Enter withdraw value: ");
		aux_idv = scan.nextDouble();
		account.withdraw(aux_idv);
		System.out.printf("Updated account data:%n");
		System.out.println(account);

		scan.close();
	}

}
