package com.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.Model.EmpModel;
import com.web.service.EmpService;

@RestController
public class restController {
	
	@Autowired
	private EmpService empService;
	
	public void setEmployeeService(EmpService empService){
		this.empService = empService;
	}
	
	@GetMapping("/employees")
	public List<EmpModel> getEmployees(){
		
		List<EmpModel> employees = empService.retriveEmployees();
		return employees;
	}
	
	@GetMapping("/employee/{employeeId}")
	public EmpModel getEmployee(@PathVariable(name="emplyoeeId")int empId){
		
		return empService.retriveEmployee(empId);
		
	}
	
	@PostMapping("/employess")
	public void saveEmployee(EmpModel employee){
		
		EmpService.saveEmployee(employee);
		
		System.out.println("Employe saved successfully");
		
	}
	
	@DeleteMapping("/employees/{employeeId}")
	public void deleteEmployee(@PathVariable(name="employeeId")int empId){
		
		EmpService.deleteEmployee(empId);
		
		System.out.println("Employee deleted successfully");
		
	}
	
	@PutMapping("/employees/{employeeId}")
	public void updateEmployee(@RequestBody EmpModel employee,
			@PathVariable(name="employeeId")int empId){
		
		EmpModel emp = EmpService.retriveEmployee(empId);
		if(emp != null){
			
			EmpService.updateEmployee(employee);
		}
		
		
		
	}
	

}
