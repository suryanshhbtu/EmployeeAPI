package com.employee.app.rest;

import org.springframework.web.bind.annotation.RestController;

import com.employee.app.entity.CustomResponse;
import com.employee.app.entity.Employee;
import com.employee.app.service.EmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api")
public class EmployeeRestController {

	EmployeeService employeeService;
	@Autowired
	public EmployeeRestController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return employeeService.getAllEmployees();
	}
	@GetMapping("/employees/{id}")
	public Employee getEmployee(@PathVariable int id) {
		return employeeService.getEmployee(id);
	}
	@PostMapping("/employees")
	public CustomResponse addEmployee(@RequestBody Employee emp) {
		emp.setId(0);
		employeeService.addEmployee(emp);
		return new CustomResponse(HttpStatus.ACCEPTED.value(), "Employe added Successfully.", System.currentTimeMillis(), emp.toString());
	}
	@PutMapping("/employees")
	public CustomResponse updateEmployee(@RequestBody Employee emp) {
		employeeService.updateEmployee(emp);
		return new CustomResponse(HttpStatus.ACCEPTED.value(), "Employe Updated Successfully.", System.currentTimeMillis(), emp.toString());
	}
	@DeleteMapping("/employees/{id}")
	public CustomResponse deleteEmployee(@PathVariable int id) {
		Employee emp = employeeService.getEmployee(id);
		if(emp == null) throw new RuntimeException("Employee Not found Of Id : "+id);
		employeeService.deleteEmployee(id);
		return new CustomResponse(HttpStatus.ACCEPTED.value(), "Employe Deleted Successfully.", System.currentTimeMillis());
	}
	
}
