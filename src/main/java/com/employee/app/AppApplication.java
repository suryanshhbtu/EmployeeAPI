package com.employee.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.employee.app.entity.Employee;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner commandLineRunner(EmployeeDAO employeeDAO) {
//		return runner -> {
////			for (Employee e : employeeDAO.getEmployees())
////				System.out.println(e.toString());
////			System.out.println(employeeDAO.getEmployee(1).toString());
//			Employee emp = new Employee("Suryanssh", "Srivastava", "suryanshhbtu@gmail.com");
//			employeeDAO.addEmployee(emp);
//			employeeDAO.deleteEmployee(7);
//			for (Employee e : employeeDAO.getEmployees())
//				System.out.println(e.toString());
//		};
//	}
}
