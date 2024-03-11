package com.bp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="micro_customer")
public class MicroCustomer {
	@Id
	private int cid;
	private String name;
	private String email;
	private long mobile;
	private String address;
	private int company_id;
	public MicroCustomer() {
		super();
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getCompany_id() {
		return company_id;
	}
	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}
	public MicroCustomer(int cid, String name, String email, long mobile, String address, int company_id) {
		super();
		this.cid = cid;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
		this.company_id = company_id;
	}
	@Override
	public String toString() {
		return "MicroCustomer [cid=" + cid + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", address="
				+ address + ", company_id=" + company_id + "]";
	}
	
	
	
	
	
	
	

}
