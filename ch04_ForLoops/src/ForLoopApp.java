
public class ForLoopApp {

	public static void main(String[] args) {
		System.out.println("Hello For Loops!");
		
		System.out.println("Pay rent once a month:");
		// one a month we'll pay rent
		for (int i=1; i <= 12; i++) {
			// do this once per month
			System.out.println("Rent paid for month "+ i);
		}
		
		System.out.println("Score some hoops! 3 pointers");
		for (int i=0; i <= 20; i+=3) {
			System.out.println("Points = "+ i);
			System.out.println("Hoop scored!");
		}
		
		System.out.println("It's Monday... boooo...  countdown to Friday!");
		for (int i=4; i >= 1; i--) {
			System.out.println(i +" days left... booo!");
		}
		System.out.println("Yea! Friday!!!");
		
		int orders = 3000;
		System.out.println("Let's process some orders.. "+orders+" orders");
		for (int i=0; i < orders; i++) {
			System.out.println("Order processed:  id = "+i);
		}
		System.out.println("All orders processed.");
		
		System.out.println("Bye");

	}

}
