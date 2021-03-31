package com.motivity.DropwizardJDBI.db;

import java.util.List;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import com.motivity.DropwizardJDBI.api.Employee;


@RegisterMapper(EmployeeMapper.class)
public interface EmployeeDao {
	@SqlQuery("select * from employee")
	public List<Employee> getEmployees();

	@SqlQuery("select * from employee where id = :id")
	public Employee getEmployee(@Bind("id") final String string);

	@SqlUpdate("insert into employee(id, name,company, salary) values(:id,:name,:company,:salary)")
	void createEmployee(@BindBean final Employee employee);

	@SqlUpdate("update employee set name =:name,company=:company,salary =:salary where id = :id")
	void editEmployee(@BindBean final Employee employee);

	@SqlUpdate("delete from employee where id = :id")
	int deleteEmployee(@Bind("id") final String id);
}
