import java.util.Scanner;

public class TableOfPowersApp {

	public static void main(String[] args) {
		// welcome
		System.out.println("Welcome to the Table Of Powers App!");
		Scanner sc = new Scanner(System.in);
		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {
			// prompt user input - n
			System.out.print("Enter an integer:  ");
			int n = sc.nextInt();
			
			System.out.println("Number\tSquared\tCubed");
			System.out.println("======\t=======\t=====");

			// biz logic - square and cube formulas
			// display output - display square and cube
			for (int i=1; i <= n; i++) {
				// each loop will produce 1 line in our table
				int squared = i*i;
				int cubed = i*i*i;
				System.out.println(i+"\t"+squared+"\t"+cubed);
			}
			System.out.println();
			System.out.print("Continue?");
			choice = sc.next();
		}
		// bye
		System.out.println("Bye");
		sc.close();
	}

}
