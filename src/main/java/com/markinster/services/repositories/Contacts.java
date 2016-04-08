package com.markinster.services.repositories;

import java.util.ArrayList;
import java.util.List;

import com.markinster.services.models.Contact;

public class Contacts {
	
	private static List<Contact> contacts;

	public Contacts() {
		contacts = new ArrayList<Contact>();
		
		contacts.add(new Contact("Marcos Soares", "123456789", "blue"));
		contacts.add(new Contact("Roger", "2355665", "red"));
		contacts.add(new Contact("Martin Fowler", "3456", "green"));
		contacts.add(new Contact("Linus Torvals", "05645", "yellow"));
		contacts.add(new Contact("Ola Bini", "123456789", "gray"));
	}
	
	public List<Contact> all() {
		return contacts;
	}

	public void add(Contact contact) {
		contacts.add(contact);		
	}
	
}
