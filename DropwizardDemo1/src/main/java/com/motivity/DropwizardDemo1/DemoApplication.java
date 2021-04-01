package com.motivity.DropwizardDemo1;

import com.motivity.DropwizardDemo1.resources.DemoResource;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class DemoApplication extends Application<DemoConfiguration> {

    public static void main(final String[] args) throws Exception {
        new DemoApplication().run(args);
    }

    @Override
    public String getName() {
        return "Demo";
    }

    @Override
    public void initialize(final Bootstrap<DemoConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final DemoConfiguration configuration,
                    final Environment environment) {
       final DemoResource resource = new DemoResource(configuration.getMessage(),
               configuration.getFirstParameter(), configuration.getSecondParameter(),configuration.getThirdParameter());
       environment.jersey().register(resource);
       
    }

}
