package com.motvity.DropwizardHibernate;

import io.dropwizard.Configuration;
import io.dropwizard.db.DataSourceFactory;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class drophibernateConfiguration extends Configuration {
	
	@Valid 
	@NotNull
	    private DataSourceFactory dataSourceFactory = new DataSourceFactory();

	   
	    @JsonProperty("database")
	    public DataSourceFactory getDataSourceFactory() {
	        return dataSourceFactory;
	    }

	    @JsonProperty("database")
	    public void setDataSourceFactory(final DataSourceFactory dataSourceFactory) {
	        this.dataSourceFactory = dataSourceFactory;
	    }
}