package entities;

public class Account {
	// ----- Attributes 
	private int account_number;
	private String account_holder;
	private double account_balance;
	
	// ----- Constructors
	
	// Constructor without initial contribution
	public Account(int account_number, String account_holder) {
		this.account_number = account_number;
		this.account_holder = account_holder;
	}
	
	// Constructor with initial contribution
	public Account(int account_number, String account_holder, double contribution) {
		this.account_number = account_number;
		this.account_holder = account_holder;
		deposit(contribution);
	}
	
	// ----- Getters and Setters
	
	public int getAccountNumber() {
		return account_number;
	}
	
	public void setAccountNumber(int account_number) {
		this.account_number = account_number;
	}
	
	public String getAccountHolder() {
		return account_holder;
	}
	
	public void setAccountHolder(String account_holder) {
		this.account_holder = account_holder;
	}
	
	public double getAccountBalance() {
		return account_balance;
	}
	
	// ----- Methods
	
	public void deposit(double amount) {
		account_balance += amount;
	}
	
	public void withdraw(double amount) {
		account_balance -= (amount + 5.00);
	}
	
	public String toString() {
		return "Account "
		+ account_number
		+ ", Holder: "
		+ account_holder
		+ ", Balance: $ "
		+ String.format("%.2f", account_balance);
	}
	
	
}
