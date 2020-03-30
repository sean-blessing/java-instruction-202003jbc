
public class ProductManagerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Product Mgr");
		// create some instances of Products and display their info
		// create 2 instances of Product
		Product p1 = new Product();
		p1.setCode("java");
		p1.setDescription("Murach's Java Programming");
		p1.setPrice(57.50);
		System.out.println(p1.toString());
		System.out.println("Price of p1 is "+p1.getPriceFormatted());
		
		Product p2 = new Product("MySQL", "Murach's MySQL", 54.50);
		System.out.println(p2);

		System.out.println(p1);
//		Product p3 = new Product ("Murach's C#", "C#", 55.50);
//		System.out.println(p3);

		System.out.println("Bye");
	}

}
