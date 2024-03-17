package com.employee.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.app.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	// nothing to do here
}
