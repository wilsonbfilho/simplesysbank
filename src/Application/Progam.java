package Application;

import java.util.Locale;
import java.util.Scanner;
import Entities.Deposit;

public class Progam {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter account hollder: ");
		String accountHolder = sc.nextLine();
		
		System.out.println("Is there initial deposit value: (Y/N)");
		String response = sc.next().toUpperCase();
		
		while (!response.equals("Y") && !response.equals("N")) {
			System.out.print("Invalid option. Please enter (Y/N): ");
			response = sc.next().toUpperCase();
		} 
		
		double balance = 0.0;
		
		if (response.equals ("Y")) {
			System.out.println("Enter initial deposit vaue: ");
			balance = sc.nextDouble();
		}
		
		Deposit deposit = new Deposit(accountNumber, accountHolder, balance);

		System.out.println("Acoount data ");
		System.out.printf("Acoount: %d%n", deposit.getAccountNumber());
		System.out.printf("Holder: %s%n", deposit.getAccountHolder());
		System.out.printf("Balance: $%.2f%n", deposit.getBalance());
		
		System.out.println("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		deposit.setBalance(deposit.getBalance() + depositValue);
 		
		
		System.out.println("Updated account data: ");
		System.out.printf("Acoount: %d%n", deposit.getAccountNumber());
		System.out.printf("Holder: %s%n", deposit.getAccountHolder());
		System.out.printf("Balance: $%.2f%n", deposit.getBalance());
		
		System.out.println("Enter withdrawal amount: ");
		double withdrawalAmount = sc.nextDouble();
		deposit.withdraw(withdrawalAmount);

		System.out.println("Updated account data:");
		System.out.printf("Account: %d%n", deposit.getAccountNumber());
		System.out.printf("Holder: %s%n", deposit.getAccountHolder());
		if (deposit.getBalance() >= 0) {
		    System.out.printf("Balance: $%.2f%n", deposit.getBalance());
		} else {
		    System.out.printf("Balance: -$%.2f%n", Math.abs(deposit.getBalance()));
		}
		
		sc.close();

	}

}
