package com.motivity.DropwizardJDBI3.core;

import java.util.List;

import org.jdbi.v3.sqlobject.config.RegisterRowMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import com.motivity.DropwizardJDBI3.api.Employee;


@RegisterRowMapper(EmployeeMapper.class)
public interface EmployeeDao {
	@SqlQuery("select * from employee")
	public List<Employee> getEmployees();

	@SqlQuery("select * from employee where id = :id")
	public Employee getEmployee(@Bind("id") final String string);

	@SqlUpdate("insert into employee(id, name,company, salary) values(:id,:name,:company,:salary)")
	int createEmployee(@BindBean final Employee employee);

	@SqlUpdate("update employee set name =:name,company=:company,salary =:salary where id = :id")
	int editEmployee(@BindBean final Employee employee);

	@SqlUpdate("delete from employee where id = :id")
	int deleteEmployee(@Bind("id") final String id);
}
