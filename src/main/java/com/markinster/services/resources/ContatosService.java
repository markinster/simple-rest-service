package com.markinster.services.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.markinster.services.models.Contato;

@Path("/contatos")
public class ContatosService {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getContatos() {
		
		List<Contato> contatos = new ArrayList<Contato>();
		
		contatos.add(new Contato("Marcos Soares", "123456789", "blue"));
		contatos.add(new Contato("Welison", "2355665", "red"));
		contatos.add(new Contato("Saulo Vieira", "3456", "green"));
		contatos.add(new Contato("Edil Lopes", "05645", "yellow"));
		contatos.add(new Contato("Rodrigo dantas", "123456789", "gray"));
		
		return Response.ok() //200
				.entity(contatos)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
				.header("Access-Control-Allow-Headers", "Content-Type")
				.build(); 
	}
}
