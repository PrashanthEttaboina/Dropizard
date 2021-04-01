package com.motivity.DropwizardDemo1;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;
import javax.validation.constraints.NotEmpty;

public class DemoConfiguration extends Configuration {
  
	@NotEmpty
   private String message;
   
	@NotEmpty
   private String firstParameter;
   
	@NotEmpty
   private String secondParameter;
   
	@NotEmpty
   private String thirdParameter;

	@JsonProperty
	public String getMessage() {
		return message;
	}
	@JsonProperty
	public void setMessage(String message) {
		this.message = message;
	}

	public String getFirstParameter() {
		return firstParameter;
	}

	public void setFirstParameter(String firstParameter) {
		this.firstParameter = firstParameter;
	}

	public String getSecondParameter() {
		return secondParameter;
	}

	public void setSecondParameter(String secondParameter) {
		this.secondParameter = secondParameter;
	}

	public String getThirdParameter() {
		return thirdParameter;
	}

	public void setThirdParameter(String thirdParameter) {
		this.thirdParameter = thirdParameter;
	}
	  
}
