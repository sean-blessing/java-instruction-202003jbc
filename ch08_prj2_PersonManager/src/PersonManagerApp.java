
public class PersonManagerApp {

	public static void main(String[] args) {
		// Welcome
		System.out.println("Welcome to the Person Manager App!");

		// -- Continue prompt start
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// Prompt for User Input:  type, fn, ln, cust# OR ssn
			String type = Console.getString("Create customer or employee? (c/e):  ",
											"c","e");
			String fn = Console.getString("First Name:  ", true);
			String ln = Console.getString("Last Name:   ", true);
			
			// Do biz logic
			Person p;
			if (type.equalsIgnoreCase("c")) {
				// person is a customer
				String custNbr = Console.getString("Customer Number:  ",true);
				Customer c = new Customer(fn,ln,custNbr);
				p = c;
			}
			else {
				// person is an employee
				String ssn = Console.getString("SSN:  ",true);
				Employee e = new Employee(fn,ln,ssn);
				p = e;
			}

			// Display Results
			System.out.println();
			System.out.println("You entered a new "+p.getClass().getName());
			System.out.println(p.toString());
			System.out.println();
			
			choice = Console.getString("Continue? (y/n):  ", "y", "n");
			// -- Continue prompt end
			System.out.println();
		}
		// Bye
		System.out.println("Bye!");
	}

}
