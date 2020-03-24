import java.util.Scanner;

public class StringsBasicsApp {

	public static void main(String[] args) {
		String message = "Hello there";
		String emptyString = "";
		String nullString = null;
		
		String firstName = "Bob";
		String lastName = "Marley";
		String fullName = firstName+" "+lastName;
		
		String fullName2 = "";
		fullName2 += firstName;
		fullName2 += " ";
		fullName2 += lastName;
		System.out.println(fullName2);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter something: ");
		String msg = sc.nextLine();
		System.out.println("You entered: "+msg);
		
		System.out.println("hello....\n\"George\t\tMcFly\"");
		
		System.out.println("println adds a line break...");
		System.out.print("print does not");
		System.out.print("... case in point");
		
		System.out.println("Enter a whole #: ");
		int a = sc.nextInt();
		
		System.out.println("Enter a decimal #: ");
		double d = sc.nextDouble();
		
		
		sc.close();
	}

}
