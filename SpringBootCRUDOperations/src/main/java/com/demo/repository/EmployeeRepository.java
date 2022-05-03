package com.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.demo.model.EmployeeModel;

public interface EmployeeRepository extends CrudRepository<EmployeeModel,Integer> {

}
