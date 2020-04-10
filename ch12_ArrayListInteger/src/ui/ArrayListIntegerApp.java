package ui;

import java.util.ArrayList;
import java.util.List;

import business.Car;

public class ArrayListIntegerApp {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		
		int n1 = 75;
		
		numbers.add(n1);
		System.out.println(numbers);
		
		
		// Define an ArrayList of Cars
		List<Car> cars = new ArrayList<>();
		
		// Create an instance of a car
		Car c1 = new Car(1, "Jeep", "Wrangler");
		
		// add instance to the list
		cars.add(c1);
		
		// Create another instance of a car
		Car c2 = new Car(1, "Honda", "Pilot");
		
		// add instance to the list
		cars.add(c2);
		
		// print the list to the console
		for (Car c: cars) {
			System.out.println(c);
		}
		
		
	}
}
