package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Employee;
import com.example.demo.services.EmpService;

@RestController
public class EmplController {
    
	@Autowired
	EmpService empServ;
	
	@GetMapping("/getallemp")
	public List<Employee> getAllEmployees() {
		
		return empServ.getAllEmployees();
	}
	
	@GetMapping("/getemp")
	public Employee getEmployeeById(int id) {
		return empServ.getEmployeeById(id);
	}
	
	@PostMapping("/insertemp")
	public Employee insertEmployee(@RequestBody Employee e) {
		return empServ.insertEmployee(e);
	}
	
	@PutMapping("/updateemp/{id}")
	public Employee updateEmployeeById(@PathVariable int id, Employee e) {
		return empServ.updateEmployeeById(id, e);
	}
	
	@DeleteMapping("/deleteemp/{id}")
	public void deleteEmployeeById(@PathVariable int id) 
	{
		 empServ.deleteEmployeesById(id);
	}
}
