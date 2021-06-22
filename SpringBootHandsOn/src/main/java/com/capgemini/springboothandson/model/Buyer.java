package com.capgemini.springboothandson.model;

public class Buyer {
private int bid;
private String bname;
private String city;
private String state;
public Buyer(int bid, String bname, String city, String state) {
	super();
	this.bid = bid;
	this.bname = bname;
	this.city = city;
	this.state = state;
}
public Buyer() {
	super();
}
public int getBid() {
	return bid;
}
public void setBid(int bid) {
	this.bid = bid;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}


}
