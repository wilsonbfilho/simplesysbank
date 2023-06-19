package Entities;

public class Deposit {
	private int accountNumber;
	private String accountHolder;
	private double balance;
	
	public Deposit(int accountNumber, String accountHolder, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void withdraw(double amount) {
	    double withdrawalAmount = amount + 5.0; // Adiciona a taxa fixa de $5.0 ao valor do saque
	    
	    if (withdrawalAmount > 0) {
	        balance -= withdrawalAmount;
	    } else {
	        System.out.println("Invalid withdrawal amount.");
	    }
	}
}


	  