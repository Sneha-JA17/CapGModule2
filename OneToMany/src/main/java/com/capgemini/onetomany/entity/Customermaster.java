package com.capgemini.onetomany.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;




@Entity
public class Customermaster {

	
	@Id
	@SequenceGenerator(name="custSeqGen",sequenceName="custSeq",initialValue=101,allocationSize=100)
	@GeneratedValue(generator="custSeqGen")
	private Integer customer_id;
	private String customer_name;
	
	
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_id")
	private List<Orders> orders = new ArrayList<Orders>();



	public Customermaster(String customer_name, List<Orders> orders) {
		super();
		this.customer_name = customer_name;
		this.orders = orders;
	}



	public Customermaster(String customer_name) {
		//super();
		this.customer_name = customer_name;
	}



	public Customermaster() {
		super();
	}



	public Integer getCustomer_id() {
		return customer_id;
	}



	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}



	public String getCustomer_name() {
		return customer_name;
	}



	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}



	public List<Orders> getOrders() {
		return orders;
	}



	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
	


	


	


	
	
}

