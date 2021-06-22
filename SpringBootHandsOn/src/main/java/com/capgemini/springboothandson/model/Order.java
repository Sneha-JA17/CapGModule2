package com.capgemini.springboothandson.model;

public class Order {
private int ordid;
private String ordname;
private double totalamt;
public Order(int ordid, String ordname, double totalamt) {
	super();
	this.ordid = ordid;
	this.ordname = ordname;
	this.totalamt = totalamt;
}
public Order() {
	super();
}
public int getOrdid() {
	return ordid;
}
public void setOrdid(int ordid) {
	this.ordid = ordid;
}
public String getOrdname() {
	return ordname;
}
public void setOrdname(String ordname) {
	this.ordname = ordname;
}
public double getTotalamt() {
	return totalamt;
}
public void setTotalamt(double totalamt) {
	this.totalamt = totalamt;
}

}
