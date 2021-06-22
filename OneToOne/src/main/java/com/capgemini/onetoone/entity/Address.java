package com.capgemini.onetoone.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Address {

	@Id
	@SequenceGenerator(name="instrSeqGen",sequenceName="instrSeq",initialValue=301,allocationSize=100)
	@GeneratedValue(generator="instrSeqGen")
	private Integer address_id;
	private String address;
	public Address( String address) {
		super();
		//this.address_id = address_id;
		this.address = address;
	}
	public Address() {
		super();
	}
	public Integer getAddress_id() {
		return address_id;
	}
	public void setAddress_id(Integer address_id) {
		this.address_id = address_id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
