import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class TravelTimeBigDecimalApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. Welcome message
		System.out.println("Welcome to the travel time calculator!");

		String choice = "y";
		// -- Start Loop
		while (choice.equalsIgnoreCase("y")) {
			// 2. Prompt for user input: miles and mph
			System.out.print("Enter miles:  ");
			String milesStr = sc.next();
			BigDecimal milesBD = new BigDecimal(milesStr);
			System.out.print("Enter mph:  ");
			//String mphStr = sc.next();
			BigDecimal mphBD = sc.nextBigDecimal();
			

			// 3. Business logic: compute travel time in hours and minutes
			// Jeff's code
//			double minutesTraveled = (miles/mph)*60;
//			int timeTraveledHours = (int)(minutesTraveled/60);
//			int remainingMinutes = (int)(minutesTraveled%60);
			BigDecimal sixty = new BigDecimal(60);
			BigDecimal minutesTraveled = milesBD.divide(mphBD,2,RoundingMode.HALF_UP).multiply(sixty);
			int timeTraveledHours = (int)minutesTraveled.divide(sixty,2,RoundingMode.HALF_UP).doubleValue();
			int remainingMinutes = (int)minutesTraveled.remainder(sixty).doubleValue();
			
			// 4. Display output: hours and minutes
			System.out.println("Estimated Travel Time");
			System.out.println("---------------------");
			System.out.println("Hours:   "+timeTraveledHours);
			System.out.println("Minutes: "+remainingMinutes);
			System.out.println();
			System.out.print("continue? (y/n)");
			choice = sc.next();
		}
		// -- End Loop
		// 5. Bye
		System.out.println("Bye");

	}

}
