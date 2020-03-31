
public class ProductDemoApp {
	
	public static void main(String[] args) {
		Product p1 = new Product("java", "Murach's Java", 57.50);
		
		String choice = "y";
		
		if (choice.equals("y")) {
			System.out.println("yep, choice is y");
		}
		
		System.out.println(p1.toString());
	}
}
