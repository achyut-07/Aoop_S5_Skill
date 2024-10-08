package com.ContactCollection;
import java.util.Objects;
public class Contact {
	private String id;
    private String name;
    private String phoneNumber;
    private String email;
    
    public Contact(String id, String name, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    
    public String getId() {
    	return id; 
    }
    public String getName() {
    	return name; 
    }
    public String getPhoneNumber() {
    	return phoneNumber; 
    }
    public String getEmail() {
    	return email; 
    }
    
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return id.equals(contact.id);
    }
    
    public int hashCode() {
        return Objects.hash(id);
    }
    
    public String toString() {
        return "Contact{id='" + id + "', name='" + name + "', phoneNumber='" + phoneNumber + "', email='" + email + "'}";
    }


}
