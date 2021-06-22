package com.capgemini.springboothandson.model;

public class Wallet {
private int walid;
private String waltype;
private int balance;
public Wallet(int walid, String waltype, int balance) {
	super();
	this.walid = walid;
	this.waltype = waltype;
	this.balance = balance;
}
public Wallet() {
	super();
}
public int getWalid() {
	return walid;
}
public void setWalid(int walid) {
	this.walid = walid;
}
public String getWaltype() {
	return waltype;
}
public void setWaltype(String waltype) {
	this.waltype = waltype;
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}


}