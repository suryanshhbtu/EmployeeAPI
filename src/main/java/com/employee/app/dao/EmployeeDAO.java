package com.employee.app.dao;

import java.util.List;

import com.employee.app.entity.Employee;

public interface EmployeeDAO {

	public List<Employee> getEmployees();
	public Employee getEmployee(int id);
	public void addEmployee(Employee e);
	public void updateEmployee(Employee e);
	public void deleteEmployee(int id);
}
