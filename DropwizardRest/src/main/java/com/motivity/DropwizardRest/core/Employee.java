package com.motivity.DropwizardRest.core;

public class Employee {

	public Employee() {
		super();
		
	}
	private String id;
	private String name;
	private String salary;
	private String company;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Employee(String id,String name,  String salary, String company) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.company = company;
	}

	
}
