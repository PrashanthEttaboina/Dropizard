package com.motvity.DropwizardHibernate;

import com.motvity.DropwizardHibernate.api.Employee;
import com.motvity.DropwizardHibernate.db.EmployeeDao;
import com.motvity.DropwizardHibernate.resources.EmployeeResource;

import io.dropwizard.Application;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.hibernate.HibernateBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class drophibernateApplication extends Application<drophibernateConfiguration> {

	 private HibernateBundle<drophibernateConfiguration> hibernate = new HibernateBundle<drophibernateConfiguration>(Employee.class) {
	        @Override
	        public DataSourceFactory getDataSourceFactory(drophibernateConfiguration config) {
	            return config.getDataSourceFactory();
	        }
	    };
	
    public static void main(final String[] args) throws Exception {
        new drophibernateApplication().run(args);
    }

    @Override
    public String getName() {
        return "drophibernate";
    }

    @Override
    public void initialize(final Bootstrap<drophibernateConfiguration> bootstrap) {
    	  bootstrap.addBundle(hibernate);
    }

    @Override
    public void run(final drophibernateConfiguration configuration,
                    final Environment environment) {
    	 EmployeeDao employeeDao = new EmployeeDao(hibernate.getSessionFactory());
         final EmployeeResource employeeResource = new EmployeeResource(employeeDao);
         environment.jersey().register(employeeResource);
    }

}
