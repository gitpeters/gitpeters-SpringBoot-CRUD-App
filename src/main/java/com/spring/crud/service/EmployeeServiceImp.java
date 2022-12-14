package com.spring.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.crud.model.Employee;
import com.spring.crud.repository.EmployeeRepository;

/*
 * Create employee service interface
 * Create a list method to display all employee inside the interface
 * Create employee service class and annotate the class
 * */

@Service
public class EmployeeServiceImp implements EmployeeService{
	
	@Autowired
	private EmployeeRepository repository;
	@Override
	public List<Employee> getAllEmployees() {
		return repository.findAll();
	}
	@Override
	public void saveEmployee(Employee employee) {
		this.repository.save(employee);
		
	}
	@Override
	public Employee getEmployeeById(long id) {
		Optional<Employee> optional = repository.findById(id);
		
		Employee employee = null;
		
		if(optional.isPresent()) {
			employee = optional.get();
		}else {
			throw new RuntimeException("Employee not found for id::"+id);
		}
		return employee;
	}
	
	@Override
	public void deleteEmployeeById(long id) {
		this.repository.deleteById(id);
		
	} 

}
