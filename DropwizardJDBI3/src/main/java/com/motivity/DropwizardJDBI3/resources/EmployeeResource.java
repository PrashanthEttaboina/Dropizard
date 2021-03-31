package com.motivity.DropwizardJDBI3.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.motivity.DropwizardJDBI3.api.Employee;
import com.motivity.DropwizardJDBI3.core.EmployeeDao;

@Path("/employee")
@Produces(MediaType.APPLICATION_JSON)

@Consumes(MediaType.APPLICATION_JSON)
public class EmployeeResource {

	private EmployeeDao employeeDao;

	public EmployeeResource(EmployeeDao employeeDao)
	{
		this.employeeDao=employeeDao;
	}
	
	@GET
	public List<Employee> getEmployees()
	{
		return employeeDao.getEmployees();
	}
	
	@GET
	@Path("{id}")
	public Employee getEmployee(@PathParam("id") String id )
	{
		return employeeDao.getEmployee(id);
		
	}
	
	@POST
	public String addEmployee(Employee employee)
	{
		int i=employeeDao.createEmployee(employee);
		
		if(i>0)
		{
			return "inserted";
		}
		return "insertion failed";
	}
	
	@PUT
	@Path("{id}")
	public String updateEmployee(Employee employee)
	{
		int i= employeeDao.editEmployee(employee);
		if(i>0)
		{
			return "Updated";
		}
		return "update failed";
		
	}
	
	@DELETE
	@Path("{id}")
	public String deleteEmployee(@PathParam("id") String id)
	{
		int i= employeeDao.deleteEmployee(id);	
		if(i>0)
		{
			return "Deleted";
		}
		return "deletion failed";
	}
		
}
