package com.rest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp_tab")
public class Employee {
	@Id
	private int id;
	private String name;
	private String password;
	private String email;
	private double salary;
	public Employee(int id, String name, String password, String email, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.salary = salary;
	}
	public Employee() {
		super();
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + ", salary="
				+ salary + "]";
	}
	
}
