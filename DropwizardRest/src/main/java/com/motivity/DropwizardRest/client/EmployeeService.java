package com.motivity.DropwizardRest.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.motivity.DropwizardRest.core.Employee;

public class EmployeeService {

	private List<Employee> employeeList = new ArrayList<Employee>(Arrays.asList(new Employee("101", "Prashanth","50000", "Motivity Labs"),
			new Employee("102", "Akhil","60000", "Motivity Labs"),new Employee("103", "Vishal","50000", "Motivity Labs")));
	
	
	public List<Employee> getAllEmployee()
	{
		return employeeList;
	}
 	
	public Employee getEmployee(String id)
	{
		Employee employee=null;
		for(Employee e: employeeList)
		{
			if(e.getId().equals(id))
			{
				employee=e;
			}
		}
		return employee;
	}

	public void addEmp(Employee e) {	
		employeeList.add(e);		
	}
	
	public void updateEmployee(Employee e, String id) {
		int i = 0;
		for (Employee emp : employeeList) {
			if (emp.getId().equals(id)) {
				employeeList.set(i, emp);
			}
			i++;
		}
	}

	public void deleteEmployee(String id) {
		for (Employee emp : employeeList) {
			if (emp.getId().equals(id)) {
				employeeList.remove(emp);
				break;
			}
		}
	}
		
}
