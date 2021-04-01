package com.motivity.DropwizardDemo1.resources;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DemoRepresentation {

	private String content;

	public DemoRepresentation() {
		//jackson deserialisation is done here
		
	}

	@JsonProperty
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public DemoRepresentation(String content) {
		this.content = content;
	}

}
