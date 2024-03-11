package com.profiles.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
public class User {
	@Id
	private int id;
	private String name;
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public User() {
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
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
	
	

}
