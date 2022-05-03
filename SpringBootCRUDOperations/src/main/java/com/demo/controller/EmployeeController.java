package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

}
