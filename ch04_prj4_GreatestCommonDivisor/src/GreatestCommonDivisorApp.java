import java.util.Scanner;

public class GreatestCommonDivisorApp {

	public static void main(String[] args) {
		// welcome
		System.out.println("Welcome to the Greatest Common Divisor App");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		System.out.println();
		
		// - while loop begins
		while (choice.equalsIgnoreCase("y")) {
			// get user input - x, y
			System.out.print("Enter first number (x):  ");
			int x = sc.nextInt();
			System.out.print("Enter second number (y):  ");
			int y = sc.nextInt();

			// do biz logic - euclidean algorithm
			// do this until x == 0
			while (x > 0) {
				while (y >= x) {
					// subtract x from y
					y = y - x;
					// y -= x;
				}
				// swap values of x and y
				int hold = y;
				y = x;
				x = hold;
			}
			// y should be the gcd

			// display output - gcd
			System.out.println("Greatest common divisor: "+y);
			System.out.println();

			// - while loop ends
			System.out.print("Continue?  ");
			choice = sc.next();
			System.out.println();
		}
		// bye
		System.out.println("Bye");
		sc.close();
	}

}
