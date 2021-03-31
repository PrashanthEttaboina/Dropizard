package com.motivity.DropwizardDemo.resources;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/")
public class ExampleGreetings {

	@GET
	@Path("/greetings/{name}")
	public String getGreeting(@PathParam("name") String name) {
		return "Hello " + name + " !";
	}
	
	@GET
	@Path("/welcome")
	public String getWelcome() {
		return "Welcome ";
	}

}

