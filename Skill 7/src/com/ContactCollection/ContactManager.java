package com.ContactCollection;
import java.util.*;
public class ContactManager {
	private Set<Contact> contactSet;
    private Map<String, Contact> contactMap;
    public ContactManager() {
        contactSet = new HashSet<>();
        contactMap = new HashMap<>();
    }
    
    public boolean addContact(Contact contact) {
        if (contactSet.add(contact)) { // Adds to the set if unique
            contactMap.put(contact.getId(), contact); // Adds to the map
            System.out.println("Contact added: " + contact);
            return true;
        } else {
            System.out.println("Contact with ID " + contact.getId() + " already exists.");
            return false;
        }
    }
    
    public boolean removeContactById(String id) {
        Contact contact = contactMap.remove(id);
        if (contact != null) {
            contactSet.remove(contact);
            System.out.println("Contact removed: " + contact);
            return true;
        } else {
            System.out.println("Contact with ID " + id + " not found.");
            return false;
        }
    }
    
    public Contact getContactById(String id) {
        return contactMap.get(id);
    }
    
    public Set<Contact> getAllContacts() {
        return contactSet;
    }
    
    public Contact searchContactByName(String name) {
        for (Contact contact : contactSet) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return contact;
            }
        }
        return null;
    }
}
