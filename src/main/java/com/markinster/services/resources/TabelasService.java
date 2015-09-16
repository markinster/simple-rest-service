package com.markinster.services.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.markinster.services.models.Cor;
import com.markinster.services.models.Operadora;

@Path("/tabelas")
public class TabelasService {
	
	@GET
	@Path("/cores")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCores() {
		
		List<Cor> cores = new ArrayList<Cor>();
		
		cores.add(new Cor("blue", "Azul"));
		cores.add(new Cor("red", "Vermelho"));
		cores.add(new Cor("green", "Verde"));
		cores.add(new Cor("yellow", "Amarelo"));
		cores.add(new Cor("gray", "Cinza"));
		cores.add(new Cor("black", "Preto"));
		cores.add(new Cor("white", "Branco"));
		
		return Response.ok() //200
				.entity(cores)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
				.header("Access-Control-Allow-Headers", "Content-Type")
				.build(); 
	}
	
	@GET
	@Path("/cores")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getOperadoras() {
		
		List<Operadora> operadoras = new ArrayList<Operadora>();
		
		operadoras.add(new Operadora("31", "Embratel", "Celular", 1.0));
		operadoras.add(new Operadora("14", "Oi", "Celular", 1.5));
		operadoras.add(new Operadora("15", "Vivo", "Celular", 1.25));
		operadoras.add(new Operadora("41", "Tim", "Celular", 1.75));
		
		return Response.ok() //200
				.entity(operadoras)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
				.header("Access-Control-Allow-Headers", "Content-Type")
				.build(); 
	}
}
