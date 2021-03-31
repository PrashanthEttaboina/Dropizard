package com.motivity.DropwizardJDBI3.core;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import com.motivity.DropwizardJDBI3.api.Employee;

public class EmployeeMapper implements RowMapper<Employee>{

	@Override
	public Employee map(ResultSet r, StatementContext ctx) throws SQLException {
		Employee employee=new Employee(r.getString("id"),r.getString("name"),r.getString("company"),r.getString("salary"));
		return employee;
	}
	
}