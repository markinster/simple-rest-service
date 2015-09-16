package com.markinster.services.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.markinster.services.models.Contact;

@Path("/contacts")
public class ContactServices {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getContacts() {
		
		List<Contact> contacts = new ArrayList<Contact>();
		
		contacts.add(new Contact("Marcos Soares", "123456789", "blue"));
		contacts.add(new Contact("Roger", "2355665", "red"));
		contacts.add(new Contact("Martin Fowler", "3456", "green"));
		contacts.add(new Contact("Linus Torvals", "05645", "yellow"));
		contacts.add(new Contact("Ola Bini", "123456789", "gray"));
		
		return Response.ok() //200
				.entity(contacts)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
				.header("Access-Control-Allow-Headers", "Content-Type")
				.build(); 
	}
}
