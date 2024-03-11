package com.rest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee_Rest")
public class Employee {
	@Id
	private int eid;
	private String ename;
	private double esalary;
	private double ta;
	private double da;
	private double hra;
	private double pf;
	private double net;
	private double gross;
	public Employee() {
		super();
	}
	public Employee(int eid, String ename, double esalary, double ta, double da, double hra, double pf, double net,
			double gross) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
		this.ta = ta;
		this.da = da;
		this.hra = hra;
		this.pf = pf;
		this.net = net;
		this.gross = gross;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsalary() {
		return esalary;
	}
	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}
	public double getTa() {
		return ta;
	}
	public void setTa(double ta) {
		this.ta = ta;
	}
	public double getDa() {
		return da;
	}
	public void setDa(double da) {
		this.da = da;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public double getPf() {
		return pf;
	}
	public void setPf(double pf) {
		this.pf = pf;
	}
	public double getNet() {
		return net;
	}
	public void setNet(double net) {
		this.net = net;
	}
	public double getGross() {
		return gross;
	}
	public void setGross(double gross) {
		this.gross = gross;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", ta=" + ta + ", da=" + da
				+ ", hra=" + hra + ", pf=" + pf + ", net=" + net + ", gross=" + gross + "]";
	}
	
	
	
}
