package com.markinster.services.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.markinster.services.models.Contact;
import com.markinster.services.repositories.Contacts;

@Path("/contacts")
public class ContactServices {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getContacts() {

		List<Contact> contacts = new Contacts().all();

		return Response.ok() // 200
				.entity(contacts).header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
				.header("Access-Control-Allow-Headers", "Content-Type").build();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getContact(Contact contact) {

		try {
			new Contacts().add(contact);

			return Response.ok() // 200
					.entity("Success")
					.header("Access-Control-Allow-Origin", "*")
					.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
					.header("Access-Control-Allow-Headers", "Content-Type")
					.build();
			
			
		} catch (Exception e) {
			return Response.status(400)
					.entity("Invalid paraters!")
					.header("Access-Control-Allow-Origin", "*")
					.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
					.header("Access-Control-Allow-Headers", "Content-Type")
					.build();
		}
	}

}
