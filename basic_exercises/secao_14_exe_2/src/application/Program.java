package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//	UPCASTING
		
		// A BusinessAccount is also a Account
		Account acc1 = bacc; 
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		//	DOWNCASTING
		
		// BusinessAccount acc4 = acc2; I can't convert Account to BusinessAccount
		// If wanna to convert a class to its subclass, i'm gonna have to force, i'm gonna have to do a manual casting
		
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);
		
		// A SavingsAccount is a Account, but is not a BusinessAccount
		// BusinessAccount acc5 = (BusinessAccount) acc3;  It's not right, doesn't work in execution time
		
		// I have to test the object first using "instance_of"
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	}

}
