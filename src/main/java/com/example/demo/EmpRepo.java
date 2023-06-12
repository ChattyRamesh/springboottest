package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "employee" ,path="employee")
public interface EmpRepo extends JpaRepository<Employee, Integer> {
	
		

}
