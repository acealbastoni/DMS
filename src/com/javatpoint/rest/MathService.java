package com.javatpoint.rest;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
@Path("/mathService")
public class MathService{
	//http://localhost:8080/restfuljerseypath/rest/hello/sum/1/2
	@GET
	@Path("/sum/{num1}/{num2}")
	public Response addTwoNumbers(@PathParam("num1") int num1 , @PathParam("num2") int num2) {
 		String output = "summation is: " + (num1+num2);
 		return Response.status(200).entity(output).build();
 	}
		
}