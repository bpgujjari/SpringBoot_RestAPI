package com.rest.model;

public class ProductCharges {
private double gst;
private double delivery;
public ProductCharges() {
	
	
}
public ProductCharges(double gst, double delivery) {
	super();
	this.gst = gst;
	this.delivery = delivery;
}
public double getGst() {
	return gst;
}
public void setGst(double gst) {
	this.gst = gst;
}
public double getDelivery() {
	return delivery;
}
public void setDelivery(double delivery) {
	this.delivery = delivery;
}
@Override
public String toString() {
	return "ProductCharges [gst=" + gst + ", delivery=" + delivery + "]";
}


}
