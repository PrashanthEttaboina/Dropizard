package com.motivity.DropwizardJDBI3;

import org.jdbi.v3.core.Jdbi;

import com.motivity.DropwizardJDBI3.core.EmployeeDao;
import com.motivity.DropwizardJDBI3.resources.EmployeeResource;

import io.dropwizard.Application;
import io.dropwizard.jdbi3.JdbiFactory;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class Jdbi3Application extends Application<Jdbi3Configuration> {

    public static void main(final String[] args) throws Exception {
        new Jdbi3Application().run(args);
    }

    @Override
    public String getName() {
        return "Jdbi3";
    }

    @Override
    public void initialize(final Bootstrap<Jdbi3Configuration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final Jdbi3Configuration configuration,
                    final Environment environment) {
        final JdbiFactory jdbiFactory= new JdbiFactory();
        final Jdbi jdbi=jdbiFactory.build(environment, configuration.getDataSourceFactory(),"mysql");
       final EmployeeDao employeeDao=jdbi.onDemand(EmployeeDao.class);
       final EmployeeResource employeeResource = new EmployeeResource(employeeDao);
       
       environment.jersey().register(employeeResource);
       
    }

}
