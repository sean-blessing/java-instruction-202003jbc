import java.util.Scanner;

public class GuessTheNumberApp {

	public static void main(String[] args) {
		//  Welcome
		System.out.println("Welcome to the Guess the Number game!");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while (choice.equals("y")) {
			//  - loop 1 - game
			//  generage int rndNbr, initialize int count
			int count = 0;
			int rndNbr = (int)(Math.random()*100)+1;
			System.out.println("the # = "+rndNbr);
			
			//  Start Game Message
			int guess = 0;
			while (guess != rndNbr) {
				//  - loop 2 - prompt and compare to rndNbr
				//  Prompt for User Input
				guess = getIntWithinRange(sc, "Enter Number:  ", 0, 101);
				count++;
				
				//  Biz Logic + Display Results - in loop
				//  compare guess to rndNbr - determine too high/low msg
				int diff = guess - rndNbr;
				String msg = "";
				if (diff < -10) {
					msg = "Way too low!!";
				}
				else if (diff < 0) {
					msg = "Too low!!";
				}
				else if (diff > 10) {
					msg = "Way too high!!";
				}
				else if (diff > 0) {
					msg = "Too high!!";
				}
				else {
					// user guessed it!
					break;
				}
				msg += "  Guess again.";
				System.out.println(msg);
			}
			//  - loop 1 ends - user guesses the number
			//  Display Results - final
			String msg = "You got it in "+count+" tries!\n";
			if (count <= 3) {
				msg += "Great work you are a mathematical wizard!";
			}
			else if (count <= 7) {
				msg += "Not too bad.  You've got some potential.";
			}
			else {
				msg += "What took you so long?  Maybe you should take some lessons?!";
			}
			System.out.println(msg+"\n");
			
			choice = tryAgainPrompt(sc, "Try again? (y/n): ");
			
		}
		
		//  Bye
		System.out.println("Bye!");
		sc.close();

	}
	
	// Data Validation Rules:
	//  - user entries must be intWithinRange
	//  - continue prompt only accepts 'y' or 'n'
	private static String tryAgainPrompt(Scanner sc, String prompt) {
		String choice = "";
		boolean isValid = false;
		while (!isValid) {
			System.out.print(prompt);
			choice = sc.next();
			if (choice.equals("y") || choice.equals("n")) {
				isValid = true;
			}
			else {
				System.out.println("Invalid choice.  Try again.");
			}
		}
		return choice;
	}
	
    public static int getIntWithinRange(Scanner sc, String prompt,
            int min, int max) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            i = getInt(sc, prompt);
            if (i <= min) {
                System.out.println(
                        "Error! Number must be greater than " + min + ".");
            } else if (i >= max) {
                System.out.println(
                        "Error! Number must be less than " + max + ".");
            } else {
                isValid = true;
            }
        }
        return i;
    }

    public static int getInt(Scanner sc, String prompt) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                isValid = true;
            } else {
                System.out.println("Error! Invalid integer. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return i;
    }

}
