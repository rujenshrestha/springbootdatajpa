package com.sresta.spring.springbootdatajpa;

import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.sresta.spring.springbootdatajpa.entity.Employee;
import com.sresta.spring.springbootdatajpa.repos.EmployeeRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootdatajpaApplicationTests {

	@Autowired
	ApplicationContext context;

	@Test
	public void saveEmployee() {
		EmployeeRepository repository = context.getBean(EmployeeRepository.class);

		/*
		 * Employee employee = new Employee(); 
		 * employee.setEmpId("E0003");
		 * employee.setEmpName("Tom Braidy");
		 * employee.setEmpAddress("3715 W Northgate Dr, Apt 808, Irving, TX 75062, USA"); 
		 * employee.setEmpContact("3612286000");
		 * repository.save(employee);
		 */

		
		 //Optional<Employee> emp = repository.findById("E0001");
		 //System.out.println(emp.toString());
		 
		/*
		 * Employee employee = new Employee(); employee.setEmpId("E0003");
		 * employee.setEmpName("Tom Braidy");
		 * employee.setEmpAddress("3715 W Northgate Dr, Apt 808, Irving, TX 75062, USA"
		 * ); employee.setEmpContact("3612281000"); repository.save(employee) ;
		 */
		 
		//List<Employee> employees = repository.findByEmpName("Rujen Shrestha");
		List<Employee> employees = repository.findByEmpNameAndEmpContact("Tom Hanks", "3612285000");
		employees.forEach(employee->System.out.println(employee.toString()));

	}

}
