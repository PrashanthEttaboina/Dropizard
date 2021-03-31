package com.motivity.DropwizardJDBI.resources;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.motivity.DropwizardJDBI.api.Employee;
import com.motivity.DropwizardJDBI.core.EmployeeService;

@Path("/employee")
@Produces(MediaType.APPLICATION_JSON)
public class EmployeeResource {
	private final EmployeeService employeeService ;

	public EmployeeResource(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@GET
	public List<Employee> getEmployees()
	{
		return employeeService.getEmployees();
		
	}
	
	@GET
	@Path("{id}")
	public Employee getEmployee(@PathParam("id") String id )
	{
		return employeeService.getEmployee(id);
		
	}
	
	@POST
	public void addEmployee(Employee employee)
	{
		employeeService.createEmployee(employee);
	}
	
	@PUT
	@Path("{id}")
	public Employee updateEmployee(Employee employee)
	{
		return employeeService.editEmployee(employee);
	}
	
	@DELETE
	@Path("{id}")
	public String deleteEmployee(@PathParam("id") String id)
	{
		return employeeService.deleteEmployee(id);	
	}
	
}
