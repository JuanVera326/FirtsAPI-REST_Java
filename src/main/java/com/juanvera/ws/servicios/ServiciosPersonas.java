package com.juanvera.ws.servicios;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.juanvera.ws.vo.*;

@Path("usuario")
public class ServiciosPersonas {
	@GET
	@Path("get")
	@Produces(MediaType.TEXT_PLAIN)
	public String getIt() {
		return "Este es el nuevo servicio";
	}
	
	@GET
    @Path("/get/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Persona getPersonaIdJson(@PathParam("id") String documento) {
    	Persona persona = null;
    	if (documento.equals("111")) {
			persona = new Persona(documento, "Pedro", true);
		}else if (documento.equals("222")) {
			persona = new Persona(documento, "Maria", true);
		}else {
			persona = new Persona(documento, "NaN", false);

		}return persona;
    }
}
