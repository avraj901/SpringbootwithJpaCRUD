package com.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.EmployeeModel;
import com.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;	
	
	public List<EmployeeModel> getAllEmploys()
	{
		List <EmployeeModel> empModel=new ArrayList<>();
		employeeRepository.findAll().forEach(empModel::add);
		return empModel;
	}
	
	public void addEmployee(EmployeeModel employeeModel) {
		employeeRepository.save(employeeModel);		
	}

	public void delete(int id) {	
		employeeRepository.deleteById(id);	
	}
	

}
