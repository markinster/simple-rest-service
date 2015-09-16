package com.markinster.services.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.markinster.services.models.Color;

@Path("/tables")
public class ColorsService {
	
	@GET
	@Path("/colors")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getColors() {
		
		List<Color> colors = new ArrayList<Color>();
		
		colors.add(new Color("blue", "Azul"));
		colors.add(new Color("red", "Vermelho"));
		colors.add(new Color("green", "Verde"));
		colors.add(new Color("yellow", "Amarelo"));
		colors.add(new Color("gray", "Cinza"));
		colors.add(new Color("black", "Preto"));
		colors.add(new Color("white", "Branco"));
		
		return Response.ok() //200
				.entity(colors)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
				.header("Access-Control-Allow-Headers", "Content-Type")
				.build(); 
	}

}
