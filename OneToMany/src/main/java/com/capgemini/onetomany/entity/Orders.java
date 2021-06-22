package com.capgemini.onetomany.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;



@Entity
public class Orders {

	@Id
	@SequenceGenerator(name="ordrSeqGen",sequenceName="ordrSeqGen",initialValue=555,allocationSize=100)
	@GeneratedValue(generator="ordrSeqGen")
	private Integer order_id;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_id")
	private Customermaster customermaster;
	
	@Column(name="order_date")
	private String order_date;
	
	@Column(name="amount")
	private Double amount;
	
	

	public Orders(Customermaster customermaster,String order_date, Double amount) {
		super();
		this.customermaster = customermaster;
		this.order_date = order_date;
		this.amount = amount;
	}

	public Orders() {
		super();
	}

	public Integer getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}



	public Customermaster getCustomermaster() {
		return customermaster;
	}

	public void setCustomermaster(Customermaster customermaster) {
		this.customermaster = customermaster;
	}

	public String getOrder_date() {
		return order_date;
	}

	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	
	
}
