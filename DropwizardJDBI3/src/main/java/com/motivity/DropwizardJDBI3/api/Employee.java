package com.motivity.DropwizardJDBI3.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {

	@JsonProperty 
	private String id;
	
	@JsonProperty 
	private String name;
	
	@JsonProperty 
	private String company;
	
	@JsonProperty
	private String salary;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public Employee(String string, String name, String company, String salary) {
		super();
		this.id = string;
		this.name = name;
		this.company = company;
		this.salary = salary;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", company=" + company + ", salary=" + salary + "]";
	}
	
	
	
}
