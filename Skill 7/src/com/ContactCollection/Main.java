package com.ContactCollection;

public class Main {
	public static void main(String[] args) {
		ContactManager contactManager = new ContactManager();
		 Contact contact1 = new Contact("1", "Achyut", "123-456-7890", "alice@example.com");
	     Contact contact2 = new Contact("2", "Bablu", "234-567-8901", "bob@example.com");
	     Contact contact3 = new Contact("3", "Sunny", "345-678-9012", "charlie@example.com");
	     
	     contactManager.addContact(contact1);
	     contactManager.addContact(contact2);
	     contactManager.addContact(contact3);
	     
	     System.out.println("\nAll Contacts:");
	     for (Contact contact : contactManager.getAllContacts()) {
	            System.out.println(contact);
	      }
	     System.out.println("\nSearching by Name (Sunny):");
	     Contact contactByName = contactManager.searchContactByName("sunny");
	     System.out.println(contactByName != null ? contactByName : "Contact not found");
	     
	     System.out.println("\nRemoving contact with ID 1:");
	     contactManager.removeContactById("1");
	     System.out.println("\nAll Contacts After Removal:");
	      for (Contact contact : contactManager.getAllContacts()) {
	            System.out.println(contact);
	      }

	}

}
