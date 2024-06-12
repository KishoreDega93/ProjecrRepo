package com.example.first.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.first.Repository.EmployeeRepository;
import com.example.first.TestModel.Employee;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {


	    @Autowired
	    private EmployeeRepository employeeRepository;

	    @GetMapping
	    public List<Employee> getAllEmployees() {
	        return employeeRepository.findAll();
	    }

	    @PostMapping
	    public Employee createEmployee(@RequestBody Employee employee) {
	        return employeeRepository.save(employee);
	    }
	    
	 // Find employees by last name
	    @GetMapping("/lastname/{lastName}")
	    public List<Employee> getEmployeesByLastName(@PathVariable String lastName) {
	        return employeeRepository.findByLastName(lastName);
	    }
	    
	    //salary between
	    @GetMapping("/salary-range")
	    public List<Employee> getEmployeesBySalaryBetween(@RequestParam Double minSalary, @RequestParam Double maxSalary) {
	        return employeeRepository.findBySalaryBetween(minSalary, maxSalary);
	    }
	}
