
public class Dice {
	private Die die1;
	private Die die2;
	
	public Dice() {
		super();
		die1 = new Die();
		die2 = new Die();
	}
	
	public int getSum() {
		int sum = die1.getValue() + die2.getValue();
		return sum;
	}
	
	public void roll() {
		die1.roll();
		die2.roll();
	}
	
	public void printRoll() {
		// display total
		System.out.println("Total: "+getSum());
		// display special message, if necessary
		if (getSum()==2) {
			System.out.println("Snake Eyes!");
		}
		else if (getSum()==6) {
			System.out.println("Box Cars!");
		}
		else if (getSum()==7) {
			System.out.println("Craps!");
		}
	}
	

	
	
	
	
}
