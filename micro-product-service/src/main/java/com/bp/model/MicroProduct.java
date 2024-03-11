package com.bp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="micro_product")
public class MicroProduct {

	@Id
	private int cmp_id;
	private int proId;
	private String proName;
	private double price;
	private int quantity;
	private double discAmt;
	private double total;
	private int bank_id;
	@Override
	public String toString() {
		return "MicroProduct [cmp_id=" + cmp_id + ", proId=" + proId + ", proName=" + proName + ", price=" + price
				+ ", quantity=" + quantity + ", discAmt=" + discAmt + ", total=" + total + ", bank_id=" + bank_id + "]";
	}
	public int getCmp_id() {
		return cmp_id;
	}
	public void setCmp_id(int cmp_id) {
		this.cmp_id = cmp_id;
	}
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getDiscAmt() {
		return discAmt;
	}
	public void setDiscAmt(double discAmt) {
		this.discAmt = discAmt;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public int getBank_id() {
		return bank_id;
	}
	public void setBank_id(int bank_id) {
		this.bank_id = bank_id;
	}
	public MicroProduct() {
		super();
	}
	public MicroProduct(int cmp_id, int proId, String proName, double price, int quantity, double discAmt, double total,
			int bank_id) {
		super();
		this.cmp_id = cmp_id;
		this.proId = proId;
		this.proName = proName;
		this.price = price;
		this.quantity = quantity;
		this.discAmt = discAmt;
		this.total = total;
		this.bank_id = bank_id;
	}
	
	
	
}
