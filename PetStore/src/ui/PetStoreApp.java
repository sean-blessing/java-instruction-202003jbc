package ui;

import java.util.ArrayList;
import java.util.List;

import business.Pet;
import util.Console;

public class PetStoreApp {
	private static List<Pet> pets;

	public static void main(String[] args) {
		// initialize
		System.out.println("Welcome to the Pet Store App!");
		pets = new ArrayList<>();
		Pet p1 = new Pet(1, "Dog", "Collie", "Rusty", 10);
		Pet p2 = new Pet(2, "Dog", "Labrador Retriever", "Sparky", 5);
		pets.add(p1);
		pets.add(p2);
	
		
		String command = "";
		while (!command.equalsIgnoreCase("exit")) {
			displayMenu();
			command = Console.getString("Command?: ",true);
			switch (command) {
			case "list":
				listPets();
				break;
			case "add":
				addPet();
				break;
			case "adopt":
				adoptPet();
				break;
			case "exit":
				break;
			}
			
		}

		
		System.out.println("Bye");
	}
	
	private static void listPets() {
		System.out.println("List of all pets:");
		System.out.println("------------------------");
		for (Pet p: pets) {
			System.out.println(p);
		}
		
	}

	private static void addPet() {
		System.out.println("Add a Pet:");
		System.out.println("------------------------");
		int id = Console.getInt("Id?: ", 0, Integer.MAX_VALUE);
		String type = Console.getString("Type?: ", true);
		String species = Console.getString("Species?: ", true);
		String name = Console.getString("Name?: ", true);
		int age = Console.getInt("Age?: ", 0,Integer.MAX_VALUE);
		Pet p = new Pet(id,type,species,name,age);
		pets.add(p);
		System.out.println("Pet added: "+p);
		System.out.println();
	}

	private static void adoptPet() {
		System.out.println("Adopt a pet:");
		System.out.println("------------------------");
		int id = Console.getInt("ID of pet to adopt?: ",0, Integer.MAX_VALUE);
		// find the pet whose id matches the one entered
		Pet p = null;
		for (Pet foundPet: pets) {
			if (foundPet.getId()==id) {
				p = foundPet;
				break;
			}
		}
		if (p!=null) {
			pets.remove(p);
			System.out.println("Pet adopted: "+p);
			System.out.println();
		}
		else {
			System.out.println("No pet found for id: "+id);
		}
		
	}

	private static void displayMenu() {
		System.out.println("COMMAND MENU:");
		System.out.println("=====================");
		System.out.println("list  - list all pets");
		System.out.println("add   - add a pet");
		System.out.println("adopt - adopt a pet");
		System.out.println("exit  - exit app");
		System.out.println();
	}
	
	
	
	
	
	
	
	

	
	
	
	
	
}
