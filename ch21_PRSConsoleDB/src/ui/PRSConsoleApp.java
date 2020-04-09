package ui;

import java.util.List;

import business.User;
import db.DAO;
import db.UserDB;
import util.Console;

public class PRSConsoleApp {

	private static DAO<User> userRepo = new UserDB();
	
	public static void main(String[] args) {
		System.out.println("Welcome to the PRS Console!");

		
		String command = "";
		while (!command.equalsIgnoreCase("exit")) {
			displayMenu();
			command = Console.getString("Command: ",true);
			switch (command) {
			case "list":
				listUsers();
				break;
			case "add":
				addUser();
				break;
			case "exit":
				break;
			default:
				System.out.println("Invalid entry");
				break;
			}
		}
		System.out.println("Bye");
	}
	
	private static void addUser() {
		// prompt for all user fields
		String un = Console.getString("UserName? ", true);
		String pw = Console.getString("Password? ", true);
		String fn = Console.getString("First Name? ", true);
		String ln = Console.getString("Last Name? ", true);
		String pn = Console.getString("PhoneNumber? ", true);
		String e = Console.getString("Email? ", true);
		// skip boolean fields for now
		User u = new User(un,pw,fn,ln,pn,e,false,false);
		if (userRepo.add(u)) {
			System.out.println("User successfully added");
		}
		else {
			System.out.println("Issue adding user.");
		}
	}

	private static void listUsers() {
		List<User> users = userRepo.list();
		
		System.out.println("List of users...");
		for (User u: users) {
			System.out.println(u);
		}
	}

	private static void displayMenu() {
		System.out.println("COMMAND MENU:");
		System.out.println("======================");
		System.out.println("list - list all users");
		System.out.println("add  - add a user");
		System.out.println("exit - exit the app");
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	

}
