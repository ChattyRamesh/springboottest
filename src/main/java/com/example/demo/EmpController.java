package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {

	@Autowired
	EmpService empService;

	@PostMapping(path = "v1/employee")
	public String addEmployee(@RequestBody Employee emp) {

		// Read datA
		System.out.println(emp);
		Integer employeeId = empService.addEmployee(emp);

		return "Employee created sucessfully : " + employeeId;

	}

	@GetMapping(path = "v1/employee")
	public List<Employee> allEmployees() {

		return empService.getEmployees();

	}

}
