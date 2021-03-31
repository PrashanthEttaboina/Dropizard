package com.motivity.DropwizardJDBI.db;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import com.motivity.DropwizardJDBI.api.Employee;

public class EmployeeMapper implements ResultSetMapper<Employee>{

	@Override
	public Employee map(int index, ResultSet r, StatementContext ctx) throws SQLException {
		Employee employee=new Employee(r.getString(1),r.getString(2),r.getString(3),r.getString(4));
		return employee;
	}
}