package com.rest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductCharges {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="chrid")
private int cid;
private double gst;
private double delivey;
public ProductCharges(double gst, double delivey) {
	super();
	this.gst = gst;
	this.delivey = delivey;
}
public ProductCharges() {
	super();
}
public double getGst() {
	return gst;
}
public void setGst(double gst) {
	this.gst = gst;
}
public double getDelivey() {
	return delivey;
}
public void setDelivey(double delivey) {
	this.delivey = delivey;
}
@Override
public String toString() {
	return "ProductCharges [gst=" + gst + ", delivey=" + delivey + "]";
}



}
