package com.rest.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Product {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="sid")
private int prodId;
private String proName;
private String proType;
private String proCategory;
private double price;
private double discount;
@OneToOne(targetEntity=ProductCharges.class,cascade=CascadeType.ALL)
@JoinColumn(name="cid",referencedColumnName="cid")
@Embedded
private ProductCharges productCharges;
private double finalPrize;
public Product(int prodId, String proName, String proType, String proCategory, double price, double discount,
		ProductCharges productCharges, double finalPrize) {
	super();
	this.prodId = prodId;
	this.proName = proName;
	this.proType = proType;
	this.proCategory = proCategory;
	this.price = price;
	this.discount = discount;
	this.productCharges = productCharges;
	this.finalPrize = finalPrize;
}
public Product() {
	super();
}
public int getProdId() {
	return prodId;
}
public void setProdId(int prodId) {
	this.prodId = prodId;
}
public String getProName() {
	return proName;
}
public void setProName(String proName) {
	this.proName = proName;
}
public String getProType() {
	return proType;
}
public void setProType(String proType) {
	this.proType = proType;
}
public String getProCategory() {
	return proCategory;
}
public void setProCategory(String proCategory) {
	this.proCategory = proCategory;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public double getDiscount() {
	return discount;
}
public void setDiscount(double discount) {
	this.discount = discount;
}
public ProductCharges getProductCharges() {
	return productCharges;
}
public void setProductCharges(ProductCharges productCharges) {
	this.productCharges = productCharges;
}
public double getFinalPrize() {
	return finalPrize;
}
public void setFinalPrize(double finalPrize) {
	this.finalPrize = finalPrize;
}
@Override
public String toString() {
	return "Product [prodId=" + prodId + ", proName=" + proName + ", proType=" + proType + ", proCategory="
			+ proCategory + ", price=" + price + ", discount=" + discount + ", productCharges=" + productCharges
			+ ", finalPrize=" + finalPrize + "]";
}




}
