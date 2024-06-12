package com.example.first.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.first.TestModel.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Find an employee by their last name
    List<Employee> findByLastName(String lastName);

    // Find an employee by their email
    Optional<Employee> findByEmail(String email);

    // Custom query to find employees by first name and last name
    List<Employee> findByFirstNameAndLastName(String firstName, String lastName);

    // Custom query to find employees whose salary is greater than a specified amount
    List<Employee> findBySalaryGreaterThan(Double salary);
    
    
    

	List<Employee> findBySalaryBetween(Double minSalary, Double maxSalary);
}

