package com.data.briks.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.data.bricks.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	Optional<Employee> findById(Long id);
	
	public static final EmployeeRepository employeeRepository = null;

	Optional<Employee> employee = employeeRepository.findById(1L);
}
