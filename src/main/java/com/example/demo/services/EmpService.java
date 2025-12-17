package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Employee;
import com.example.demo.repository.EmpRepository;

@Service
public class EmpService {
	
	@Autowired
	EmpRepository empRepo;
	
	public List<Employee> getAllEmployees() {
		
		return empRepo.findAll();
	}
	
	
	public Employee getEmployeeById(int id) {
		return empRepo.findById(id).orElse(null);
	}
	
	
	public Employee insertEmployee(Employee e) {
		return empRepo.save(e);
	}
	
	
	public Employee updateEmployeeById(int id,Employee e) {
		Employee emp =  empRepo.findById(id).orElse(null);
		emp.setName(e.getName());
		emp.setSalary(e.getSalary());
		return empRepo.save(emp);
		
		
	}
	
	
	public void deleteEmployeesById(int id) {
		 empRepo.deleteById(id);
	}
}
