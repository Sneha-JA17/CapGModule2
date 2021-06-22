package com.capgemini.springboothandson.model;

public class Seller {

	private int sid;
	private String sname;
	private String city;
	private  String state;
	public Seller(int sid, String sname, String city, String state) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.city = city;
		this.state = state;
	}

	
	  public Seller() 
	  { 
		  super(); 
	  }
	 
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
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
