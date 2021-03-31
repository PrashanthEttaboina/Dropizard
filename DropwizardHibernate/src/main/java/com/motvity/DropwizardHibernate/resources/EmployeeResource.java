package com.motvity.DropwizardHibernate.resources;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.motvity.DropwizardHibernate.api.Employee;
import com.motvity.DropwizardHibernate.db.EmployeeDao;

import io.dropwizard.hibernate.UnitOfWork;

@Path("/employee")
@Produces(MediaType.APPLICATION_JSON)
public class EmployeeResource {

	 private EmployeeDao employeeDao;

	    public EmployeeResource(EmployeeDao employeeDao) {
	        this.employeeDao = employeeDao;
	    }
  
	    @GET
	    @UnitOfWork
		public List<Employee> getEmployees()
		{
			return employeeDao.getEmployees();
		}
		
		@GET
		 @UnitOfWork
		@Path("{id}")
		public Employee getEmployee(@PathParam("id") String id )
		{
			return employeeDao.getEmployee(id);
			
		}
		
		@POST
		 @UnitOfWork
		public void addEmployee(Employee employee)
		{
			employeeDao.addEmployee(employee);
			
		}
		
		@PUT
		 @UnitOfWork
		@Path("{id}")
		public void updateEmployee(Employee employee)
		{
			employeeDao.updateEmployee(employee);
			
			
		}
		
		@DELETE
		 @UnitOfWork
		@Path("{id}")
		public void deleteEmployee(@PathParam("id") String id)
		{
			 employeeDao.deleteEmployee(id);	
		}
			
	    
}
