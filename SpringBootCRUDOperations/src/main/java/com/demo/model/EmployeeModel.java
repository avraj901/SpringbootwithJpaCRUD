package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (schema="mysql1", name="record")
public class EmployeeModel {
	@Id
	private int id ;
	private String name ;
	private String address;
	private String email;
	public EmployeeModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeModel(int id, String name, String address, String email) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
	}
	@Override
	public String toString() {
		return "EmployeeModel [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
