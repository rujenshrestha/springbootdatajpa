package com.sresta.spring.springbootdatajpa.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sresta.spring.springbootdatajpa.entity.Employee;
import com.sresta.spring.springbootdatajpa.repos.EmployeeRepository;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	EmployeeRepository repository;

	@GetMapping
	public Iterable<Employee> getAll(){
		return repository.findAll();
	}
	
	@PostMapping
	public Employee create(@RequestBody Employee employee) {
		return repository.save(employee);
	}
	
	@PutMapping
	public Employee update(@RequestBody Employee employee) {
		return repository.save(employee);
	}
	
	@GetMapping("/{empId}")
	public Optional<Employee> getEmployee(@PathVariable("empId") String empId) {
		return repository.findById(empId);
	}
	
	@DeleteMapping("/{empId}")
	public void delete(@PathVariable("empId") String empId) {
		repository.deleteById(empId);
	}
}
