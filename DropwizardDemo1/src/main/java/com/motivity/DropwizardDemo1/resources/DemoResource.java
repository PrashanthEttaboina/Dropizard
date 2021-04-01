package com.motivity.DropwizardDemo1.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.codahale.metrics.annotation.Timed;

@Path("/resource")
@Produces(MediaType.APPLICATION_JSON)
public class DemoResource {

	private String message;
	private String firstParameter;
	private String secondParameter;
	private String thirdParameter;

	public DemoResource(String message, String firstParameter, String secondParameter, String thirdParameter) {
		super();
		this.message = message;
		this.firstParameter = firstParameter;
		this.secondParameter = secondParameter;
		this.thirdParameter = thirdParameter;
	}

	@GET
	@Timed
	public DemoRepresentation getMessage() {
	
		final String value=String.format(message,firstParameter,secondParameter,thirdParameter);
		return new DemoRepresentation(value);
		
	}	
}
