package com.bp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="micro_payment")
public class MicroPayment {
	@Id
	private int bank_id;
	private long acno;
	private String account_name;
	private double balance;
	public MicroPayment(int bank_id, long acno, String account_name, double balance) {
		super();
		this.bank_id = bank_id;
		this.acno = acno;
		this.account_name = account_name;
		this.balance = balance;
	}
	public MicroPayment() {
		super();
	}
	public int getBank_id() {
		return bank_id;
	}
	public void setBank_id(int bank_id) {
		this.bank_id = bank_id;
	}
	public long getAcno() {
		return acno;
	}
	public void setAcno(long acno) {
		this.acno = acno;
	}
	public String getAccount_name() {
		return account_name;
	}
	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "MicroPayment [bank_id=" + bank_id + ", acno=" + acno + ", account_name=" + account_name + ", balance="
				+ balance + "]";
	}
	
	
	

}
