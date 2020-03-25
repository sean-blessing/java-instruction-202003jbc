import java.util.Scanner;

public class TravelTimeApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. Welcome message
		System.out.println("Welcome to the travel time calculator!");

		String choice = "y";
		// -- Start Loop
		while (choice.equalsIgnoreCase("y")) {
			// 2. Prompt for user input: miles and mph
			System.out.print("Enter miles:  ");
			double miles = sc.nextDouble();
			System.out.print("Enter mph:  ");
			double mph = sc.nextDouble();

			// 3. Business logic: compute travel time in hours and minutes
			// hoursMin = miles / mph
//			double hoursMin = miles / mph;
//			System.out.println("hoursMin = "+hoursMin);
//			// minutes = hoursMin * 60
//			int minutes = (int)hoursMin *60; 
//			System.out.println("minutes = "+minutes);
//			// hoursInt = (int)minutes / 60
//			int hoursInt = (int)minutes / 60;
//			System.out.println("hoursInt = "+hoursInt);
//			// minutes = (int)minutes % 60
//			minutes = (int)(minutes % 60);
//			System.out.println("minutes = "+minutes);
			// Jeff's code
			double minutesTraveled = (miles/mph)*60;
			int timeTraveledHours = (int)(minutesTraveled/60);
			int remainingMinutes = (int)(minutesTraveled%60);
			
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
