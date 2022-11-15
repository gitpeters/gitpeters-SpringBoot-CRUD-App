package com.spring.crud.service;

import java.util.List;

import com.spring.crud.model.Employee;

public interface EmployeeService {
	
	//List method to display all employees
	List<Employee> getAllEmployees();
	
	//Create save method to save employee
	void saveEmployee(Employee employee);
	
	Employee getEmployeeById(long id);
	
	void deleteEmployeeById(long id);

}
