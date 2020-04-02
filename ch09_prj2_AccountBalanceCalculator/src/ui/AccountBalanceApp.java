package ui;
import java.text.NumberFormat;

//import business.Account;
//import business.CheckingAccount;
//import business.SavingsAccount;
import business.*;
import util.Console;

public class AccountBalanceApp {

	private static NumberFormat cf = NumberFormat.getCurrencyInstance();

	public static void main(String[] args) {
		// Welcome msg + initialization
		// create savingsAccount and checkingAccount w/ 1000 balances each
		System.out.println("Welcome to the Account Balance Calculator!");
		SavingsAccount sa = new SavingsAccount(1000, .01);
		CheckingAccount ca = new CheckingAccount(1000, 1);
	
		// display initial balances
		System.out.println("Starting Balances:");
		summarizeAccountBalances(ca,sa);
		System.out.println();
		System.out.println("Enter transactions for the month:");
		System.out.println();
		
		String choice = "y";
		// - start loop
		while (choice.equalsIgnoreCase("y")) {
			// Get user input - loop through monthly transactions
			// transaction = w/d, c/s
			// transType: String
			// acctType: String
			// amount: double
			String transType = Console.getString("Withdraw or Deposit? (w/d):  ", "w", "d");
			String acctType = Console.getString("Checking or Savings? (c/s):  ", "c", "s");

			// business logic
			// apply transaction to appropriate account
			Account a;
			if (acctType.equals("c")) {
				a = ca;
			}
			else {
				a = sa;
			}
			
			if (transType.equals("w")) {
				// prompt for amount once we know the account they intend to transact
				double amount = Console.getDouble("Amount? ", 0, a.getBalance()+1);
				a.withdraw(amount);
			}
			else {
				double amount = Console.getDouble("Amount? ", 0, Double.POSITIVE_INFINITY);
				a.deposit(amount);
			}

			// - end loop (user enters 'n' to continue)
			choice = Console.getString("Continue? (y/n):  ",true);
		}
		// calculate monthly payments and fees
		// apply pmts and fees to balances
		sa.applyPayment();
		ca.subtractMonthlyFee();
		
		// summarize pmts and fees
		System.out.println("Monthly Payments and Fees:");
		System.out.println("Checking Fee:              "+cf.format(ca.getMonthlyFee()));
		System.out.println("Savings Interest Payment:  "+cf.format(sa.getMonthlyInterestPayment()));
		// summarize final balances
		System.out.println("Final Balances:");
		summarizeAccountBalances(ca, sa);
		// Bye!

	}

	private static void summarizeAccountBalances(CheckingAccount ca, SavingsAccount sa) {
		System.out.println("Checking: " + cf.format(ca.getBalance()));
		System.out.println("Savings:  " + cf.format(sa.getBalance()));
	}

}
