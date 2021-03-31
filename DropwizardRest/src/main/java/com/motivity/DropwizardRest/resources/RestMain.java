package com.motivity.DropwizardRest.resources;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.motivity.DropwizardRest.client.EmployeeService;
import com.motivity.DropwizardRest.core.Employee;

@Path("/")
@Produces("application/json")
public class RestMain {

	private EmployeeService es= new EmployeeService();
	
	@GET
	@Path("/employee")
	public List<Employee> getEmployees()
	{
		return es.getAllEmployee();
	}
	
	@GET
	@Path("/employee/{id}")
	public Employee getEmployee(@PathParam("id") String id)
	{
		Employee e=es.getEmployee(id);
		return e;	
	}
	
	@POST
	@Path("/employee/add")
	public void addEmployee(Employee e)
	{
		 es.addEmp(e);		
	}
	
	@DELETE
	@Path("/employee/delete/{id}")
	public void deleteEmployee(@PathParam("id") String id)
	{
		es.deleteEmployee(id);
	}
	
	@PUT
	@Path("/employee/update/{id}")
	public void updateEmployee(Employee e,@PathParam("id") String id) {
		 es.updateEmployee(e,id);
		
	}
	
}
