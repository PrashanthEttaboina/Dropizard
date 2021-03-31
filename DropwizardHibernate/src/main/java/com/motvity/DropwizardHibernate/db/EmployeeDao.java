package com.motvity.DropwizardHibernate.db;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.motvity.DropwizardHibernate.api.Employee;
import io.dropwizard.hibernate.AbstractDAO;

public class EmployeeDao extends AbstractDAO<Employee> {

	public EmployeeDao(SessionFactory sessionFactory) {
		super(sessionFactory);
	
	}
	
	public List<Employee> getEmployees()
	{
		 CriteriaQuery<Employee> criteriaQuery = currentSession().getCriteriaBuilder().createQuery(Employee.class);
	        Root<Employee> root = criteriaQuery.from(Employee.class);
	        criteriaQuery.select(root);
	        Query<Employee> query = currentSession().createQuery(criteriaQuery);
	        return query.getResultList();
	}
	
	 public Employee getEmployee(String id) {
	        return currentSession().get(Employee.class, id);
	    }

	    public Employee addEmployee(Employee employee) {
	        return persist(employee);
	    }

	    public void updateEmployee(Employee employee) {
	      currentSession().saveOrUpdate(employee);
	    }

	    public void deleteEmployee(String id) {
	        Employee e=getEmployee(id);
	    	currentSession().delete(e);
	        
	    }
}
