package com.vaccination.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vaccination_vaccine")
public class Vaccination {
@Id
private int vcid;
private String vcname;
private String vcaddress;
public int getVcid() {
	return vcid;
}
public void setVcid(int vcid) {
	this.vcid = vcid;
}
public String getVcname() {
	return vcname;
}
public void setVcname(String vcname) {
	this.vcname = vcname;
}
public String getVcaddress() {
	return vcaddress;
}
public void setVcaddress(String vcaddress) {
	this.vcaddress = vcaddress;
}
public Vaccination(int vcid, String vcname, String vcaddress) {
	super();
	this.vcid = vcid;
	this.vcname = vcname;
	this.vcaddress = vcaddress;
}
public Vaccination() {
	super();
}
@Override
public String toString() {
	return "Vaccination [vcid=" + vcid + ", vcname=" + vcname + ", vcaddress=" + vcaddress + "]";
}




}
