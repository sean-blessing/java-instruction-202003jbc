package ui;

import java.util.ArrayList;
import java.util.List;

import business.Contact;
import business.TestContact;

public class ContactManagerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Contact Manager App!");
		
		List<Contact> contacts = new ArrayList<>();
		
		contacts.add(new Contact("Mike Murach", null, "800-221-5528"));
		contacts.add(new Contact("Anne Boehm", null, null));
		contacts.add(new Contact("Joel Murach", "joel@murach.com", null));

		// print list of all contacts
		System.out.println("All contacts:");
		displayContacts(contacts);
		
		System.out.println("List of contacts missing phone #s - no lambda:");
		List<Contact> contactsNoPhone = filterContactsWithoutPhone(contacts);
		displayContacts(contactsNoPhone);
		
		System.out.println("List of contacts missing phone #s - lambda:");
		List<Contact> contactsNoPhone2 = filterContacts(contacts,
				c -> c.getPhone()==null);
		displayContacts(contactsNoPhone2);

		System.out.println("List of contacts missing emails - lambda:");
		List<Contact> contactsNoEmail = filterContacts(contacts,
				c -> c.getEmail()==null);
		displayContacts(contactsNoEmail);

		System.out.println("Bye");

	}

	private static void displayContacts(List<Contact> contacts) {
		for (Contact c: contacts) {
			System.out.println(c);
		}
	}
	
	public static List<Contact> filterContactsWithoutPhone(List<Contact> contacts) {
		List<Contact> contactsWithoutPhone = new ArrayList<>();
		for (Contact c: contacts) {
			if (c.getPhone() == null) {
				contactsWithoutPhone.add(c);
			}
		}
		return contactsWithoutPhone;
	}
	
	public static List<Contact> filterContacts(List<Contact> contacts, 
											   TestContact condition) {
		List<Contact> filteredContacts = new ArrayList<>();
		for (Contact c: contacts) {
			if (condition.test(c)) {
				filteredContacts.add(c);
			}
		}
			
		return filteredContacts;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
