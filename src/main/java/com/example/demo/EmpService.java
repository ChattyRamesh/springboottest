package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {
	
	@Autowired
	EmpRepo empRepo;
	
	public Integer addEmployee(Employee emp) {
		empRepo.save(emp);
		return emp.getEmpId();
		
	}

	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}

}
