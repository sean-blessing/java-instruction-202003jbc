import java.util.Scanner;

public class MenuApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		Scanner sc = new Scanner(System.in);
		// demonstrate the use of a switch statement in a menu
		String choice = "";
		while (!choice.equalsIgnoreCase("x")) {
			// display the menu
			String menu = "MENU\n" +
						  "===============\n" +
						  "L - list all users\n" +
						  "C - create a user\n" +
						  "U - update a user\n" +
						  "D - delete a user\n" +
						  "G - get a user\n" +
						  "X - exit\n";
			System.out.println(menu);
			
			// get the user choice
			choice = sc.next();
			
			// do something based on that choice
			switch (choice) {
				case "l":
				case "L":
					System.out.println("Listing all users...");
					break;
				case "c":
				case "C":
					System.out.println("Creating a user...");
					break;
				case "u":
				case "U":
					System.out.println("Updating a user...");
					break;
				case "d":
				case "D":
					System.out.println("Deleting a user...");
					break;
				case "g":
				case "G":
					System.out.println("Get a user...");
					break;
				case "x":
				case "X":
					break;
				default:
					System.out.println("Invalid choice, try again.");
					break;
			}
		}
		
		
		System.out.println("Goodbye");

	}

}
