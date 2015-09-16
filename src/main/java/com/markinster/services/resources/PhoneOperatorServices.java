package com.markinster.services.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.markinster.services.models.PhoneOperator;

@Path("/tables")
public class PhoneOperatorServices {
	
	@GET
	@Path("/colors")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getColors() {
		
		List<PhoneOperator> operators = new ArrayList<PhoneOperator>();
		
		operators.add(new PhoneOperator("31", "Embratel", "Celular", 1.0));
		operators.add(new PhoneOperator("14", "Oi", "Celular", 1.5));
		operators.add(new PhoneOperator("15", "Vivo", "Celular", 1.25));
		operators.add(new PhoneOperator("41", "Tim", "Celular", 1.75));

		
		return Response.ok() //200
				.entity(operators)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
				.header("Access-Control-Allow-Headers", "Content-Type")
				.build(); 
	}

}
