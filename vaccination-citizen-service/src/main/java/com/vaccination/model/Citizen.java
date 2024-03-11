package com.vaccination.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vaccine_citizen")
public class Citizen {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	private String cname;
	private int vccenterid;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getVccenterid() {
		return vccenterid;
	}
	public void setVccenterid(int vccenterid) {
		this.vccenterid = vccenterid;
	}
	public Citizen(int cid, String cname, int vccenterid) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.vccenterid = vccenterid;
	}
	public Citizen() {
		super();
	}
	@Override
	public String toString() {
		return "Citizen [cid=" + cid + ", cname=" + cname + ", vccenterid=" + vccenterid + "]";
	}
	
	
	

}
