package com.motivity.DropwizardJDBI;

import javax.sql.DataSource;

import org.skife.jdbi.v2.DBI;

import com.motivity.DropwizardJDBI.core.EmployeeService;
import com.motivity.DropwizardJDBI.resources.EmployeeResource;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class motivityApplication extends Application<motivityConfiguration> {

    public static void main(final String[] args) throws Exception {
        new motivityApplication().run(args);
    }

    @Override
    public String getName() {
        return "motivity";
    }

    @Override
    public void initialize(final Bootstrap<motivityConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final motivityConfiguration configuration, final Environment environment) {
    	DataSource dataSource=configuration.getDataSourceFactory().build(environment.metrics(), "sql");
		DBI dbi=new DBI(dataSource);
		environment.jersey().register(new EmployeeResource(dbi.onDemand(EmployeeService.class)));
	}

}
