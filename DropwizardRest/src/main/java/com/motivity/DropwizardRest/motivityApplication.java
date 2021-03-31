package com.motivity.DropwizardRest;

import com.motivity.DropwizardRest.resources.RestMain;

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
    public void run(final motivityConfiguration configuration,
                    final Environment environment) {
      environment.jersey().register(new RestMain());
    	
    }

}
