
public class CarApp {

	public static void main(String[] args) {
		// create an instance of car
		Car c1 = new Car();
		c1.setMake("Volswagen");
		c1.setModel("Atlas");
		c1.setYear(2018);
		c1.setMpg(22.5);
		Car c2 = new Car("Jeep", "Wrangler", 2013, 17.5);
		
		// print its contents
		System.out.println(c1);
		System.out.println(c2);
		//c1.mpg = 21.7;
		//System.out.println("c1 mpg = "+c1.mpg);
	}

}
