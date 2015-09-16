package com.markinster.services.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.markinster.services.models.Color;
import com.markinster.services.repositories.Colors;

@Path("/colors")
public class ColorServices {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getColors() {	
		
		List<Color> entity = new Colors().all();
		
		return Response.ok() //200
				.entity(entity)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
				.header("Access-Control-Allow-Headers", "Content-Type")
				.build(); 
	}

}
