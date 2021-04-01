package com.motvity.DropwizardLogging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class LoggingApplication extends Application<LoggingConfiguration> {
	
	public static final Logger log=LoggerFactory.getLogger(LoggingApplication.class);

    public static void main(final String[] args) throws Exception {
        new LoggingApplication().run(args);
    }

    @Override
    public String getName() {
        return "Logging";
    }

    @Override
    public void initialize(final Bootstrap<LoggingConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final LoggingConfiguration configuration,
                    final Environment environment) {
    	System.out.println("Start.....");
    	log.debug("debugging");
    	log.info("information");
    	log.error("no error");
    	System.out.println("end.......");
    }

}
