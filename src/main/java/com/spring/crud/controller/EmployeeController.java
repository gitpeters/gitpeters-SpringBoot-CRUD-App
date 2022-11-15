package com.spring.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.crud.model.Employee;
import com.spring.crud.service.EmployeeService;

@Controller
public class EmployeeController {
	
	//Create a method handler for home page (index.html) to display a list of employees
	
	@Autowired
	private EmployeeService service;
	
	//Display Employee Record handler
	@GetMapping("/")
	public String viewHomePage(Model model) {
		
		model.addAttribute("listEmployees", service.getAllEmployees());
		return "index";// return Thymeleaf template (HTML page)
	}
	
	//Add Employee handler
	@GetMapping("/showNewEmployeeForm")
	public String showNewEmployeeform(Model model) {
		//create model attribute to bind the form data
		Employee employee = new Employee();
		
		model.addAttribute("employee", employee);
		return "new_employee";
		
	}
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		//save record to db
		
		service.saveEmployee(employee);
		
		
		return "redirect:/"; //return back to home page after successfully save
		
	}
	
	@GetMapping("/showFormUpdate/{id}")
	public String showFormUpdate(@PathVariable(value="id") long id, Model model) {
		
		//Get employee from the service
		
		Employee employee = service.getEmployeeById(id);
		
		//Set employee as a model attribute to pre-populate the form
		model.addAttribute("employee", employee);
		return "update_employee";
		
	}
	
	@GetMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable(value="id") long id, Model model) {
		this.service.deleteEmployeeById(id);
		return "redirect:/";
		
	}

}
