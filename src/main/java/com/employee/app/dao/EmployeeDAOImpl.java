package com.employee.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee.app.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository 
public class EmployeeDAOImpl implements EmployeeDAO {
	
	private EntityManager entityManager;
	@Autowired
	public EmployeeDAOImpl(EntityManager em) {
		entityManager = em;
	}
	@Override
	public List<Employee> getEmployees() {
		TypedQuery<Employee> typedQuery = entityManager.createQuery("from Employee", Employee.class);
		List<Employee> res = typedQuery.getResultList();
		return res;
		
	}

	@Override
	public Employee getEmployee(int id) {
		return entityManager.find(Employee.class, id);
	}

	@Override
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		entityManager.persist(e);
	}

	@Override
	public void updateEmployee(Employee e) {
		// merge inserts or update if already present
		entityManager.merge(e);
		
	}

	@Override
	public void deleteEmployee(int id) {
//		Method 1
//		int rowsDeleted = entityManager.createQuery("delete from employee where id>"+id, Employee.class).executeUpdate();
//		System.out.println(rowsDeleted);
//		Method 2
		Employee e = entityManager.find(Employee.class, id);
		entityManager.remove(e);
	}

}
