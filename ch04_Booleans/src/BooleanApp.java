import java.util.Scanner;

public class BooleanApp {

	public static void main(String[] args) {
		boolean isValid;
		
		isValid = false;
		
		while (isValid == false) {
			System.out.println("Loop runs as long as isValid is false!");
			break;
		}
		
		isValid = true;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a #: ");
		int i = sc.nextInt();
		
		while (isValid) {
			System.out.println("isValid is true.");
			break;
		}

	}

}
