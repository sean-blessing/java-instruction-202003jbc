
public class DiceRollerApp {

	public static void main(String[] args) {
		// Welcome
		System.out.println("Welcome to the Dice Roller!");

		// Get User Input: Roll Die? : 'Y' or 'y'
		String choice = Console.getString("Roll the dice? (y/n)");

		while (choice.equalsIgnoreCase("y")) {
			// Biz Logic: Sum the dice
			Dice d = new Dice();
			d.roll();

			// Display Results: Display Total, Msg
			d.printRoll();
			
			choice = Console.getString("Roll again? (y/n)");
		}

		// Bye
		System.out.println("Bye!");
	}

}
