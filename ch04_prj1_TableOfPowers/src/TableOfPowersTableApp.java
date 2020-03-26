import java.util.Scanner;

public class TableOfPowersTableApp {

	public static void main(String[] args) {
		// welcome
		System.out.println("Welcome to the Table Of Powers App!");
		Scanner sc = new Scanner(System.in);
		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {
			// prompt user input - n
			System.out.print("Enter an integer:  ");
			int n = sc.nextInt();
			
			String table = "";
			String header = "";
			header += "Number\tSquared\tCubed\n";
			header += "======\t=======\t=====\n";
			table += header;

			// biz logic - square and cube formulas
			// display output - display square and cube
			for (int i=1; i <= n; i++) {
				// each loop will produce 1 line in our table
				int squared = i*i;
				int cubed = i*i*i;
				String row = i+"\t"+squared+"\t"+cubed+"\n";
				table += row;
			}
			System.out.println(table);
			System.out.println();
			System.out.print("Continue?");
			choice = sc.next();
		}
		// bye
		System.out.println("Bye");
		sc.close();
	}

}
