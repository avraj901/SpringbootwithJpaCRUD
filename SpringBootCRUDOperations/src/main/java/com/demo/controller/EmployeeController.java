package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.EmployeeModel;
import com.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	 
	@GetMapping("/get")
	public List<EmployeeModel> getAllEmploy() {
		return employeeService.getAllEmploys();
	}
	@PostMapping("/post")
	public void addUser(@RequestBody EmployeeModel employeeModel) {
		employeeService.addEmployee(employeeModel);
	}
	@DeleteMapping("/delete/{id}")
	public void DeleteId(@PathVariable("id") int id)
	{
		employeeService.delete(id);
	}
}
