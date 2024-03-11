package com.fs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class FullStackDemo {
	@Id
	private Integer id;
	private String name;
	private Long salary;
	@Override
	public String toString() {
		return "FullStackDemo [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public FullStackDemo(Integer id, String name, Long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public FullStackDemo() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	
	
	
}
