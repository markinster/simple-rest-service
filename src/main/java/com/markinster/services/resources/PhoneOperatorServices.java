package com.markinster.services.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.markinster.services.models.PhoneOperator;
import com.markinster.services.repositories.Operators;

public class PhoneOperatorServices {
	
	@GET
	@Path("/operators")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getOperators() {
		
		List<PhoneOperator> operators = new Operators().all();
		
		return Response.ok() //200
				.entity(operators)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
				.header("Access-Control-Allow-Headers", "Content-Type")
				.build(); 
	}

}
