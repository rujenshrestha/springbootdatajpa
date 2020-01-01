package com.sresta.spring.springbootdatajpa.repos;

import org.springframework.data.repository.CrudRepository;

import com.sresta.spring.springbootdatajpa.entity.Employee;
import java.lang.String;
import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, String> {

	/*
	 * Custom findBy methods: Spring boot data documentation
	 */
	
	List<Employee> findByEmpName(String empname);
	
	List<Employee> findByEmpContact(String empcontact);
	
	List<Employee> findByEmpNameAndEmpContact(String empname, String empcontact);
}
