package com.motivity.DropwizardDemo;

import com.motivity.DropwizardDemo.resources.ExampleGreetings;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class ExampleApplication extends Application<ExampleConfiguration> {

    public static void main(final String[] args) throws Exception {
        new ExampleApplication().run(args);
    }

    @Override
    public String getName() {
        return "Example";
    }

    @Override
    public void initialize(final Bootstrap<ExampleConfiguration> bootstrap) {
       
    }

    @Override
    public void run(final ExampleConfiguration configuration,
                    final Environment environment) {
       
    	environment.jersey().register(new ExampleGreetings());
    	
    }

}
