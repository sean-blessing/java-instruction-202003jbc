package ui;

import java.text.NumberFormat;

import util.Console;

public class BattingStatisticsApp {

	public static void main(String[] args) {
		// Welcome
		System.out.println("Welcome to the Batting Stats App!");
		System.out.println();
		
		String choice = "y";
		// - start loop
		while (choice.equalsIgnoreCase("y")) {
			// Get User Input
			// - int atBat
			// - int[] results
			int atBat = Console.getInt("Enter number of times at bat: ", 0, 31);
			System.out.println();
			int[] results = new int[atBat];
			for (int i=0; i < results.length; i++) {
				// prompt user for result at bat for this time at bat
				int result = Console.getInt("Result for at-bat "+(i+1)+":",
											-1, 5);
				results[i] = result;
			}
			System.out.println();
			// Business Logic
			// - double battingAvg = (results[] > 0) / atBat
			// - double sluggingPct = basesEarned / atBat
			int atBatsGreaterThanOne = 0;
			int basesEarned = 0;
			for (int result: results) {
				basesEarned += result;
				if (result > 0)
					atBatsGreaterThanOne ++;
			}
			double battingAvg = atBatsGreaterThanOne / (double)atBat;
			double sluggingPct = basesEarned / (double)atBat;

			// Display Results - battingAvg, sluggingPct
			NumberFormat nf = NumberFormat.getNumberInstance();
			nf.setMinimumFractionDigits(3);
			nf.setMaximumFractionDigits(3);
			System.out.println("Batting average: "+nf.format(battingAvg));
			System.out.println("Slugging percent: "+nf.format(sluggingPct));
			System.out.println();

			// - end loop
			choice = Console.getString("Another player? (y/n): ",true);
			System.out.println();
		}
		// Bye
		System.out.println("Bye");

	}

}
