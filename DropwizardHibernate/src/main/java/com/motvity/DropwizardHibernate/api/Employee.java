package com.motvity.DropwizardHibernate.api;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="employee")

public class Employee {

	@Id
	@NotNull
    @JsonProperty
	private String id;
	
	@NotNull
    @JsonProperty
	@Column(name="name")
	private String name;
	
	@NotNull
    @JsonProperty
	@Column(name="company")
	private String company;
	
	@NotNull
    @JsonProperty
	@Column(name="salary")
	private String salary;

	public  String getId() {
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

	public Employee(String id, String name, String company, String salary) {
		super();
		this.id = id;
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
