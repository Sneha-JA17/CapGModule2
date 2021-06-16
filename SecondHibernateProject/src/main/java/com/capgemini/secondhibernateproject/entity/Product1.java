package com.capgemini.secondhibernateproject.entity;


	import java.io.Serializable;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;
	import javax.persistence.UniqueConstraint;

	@Entity
	public class Product1 implements Serializable {
	private static final long serialVersionUID = 1L;

	public Product1(String name, double price, String feature) {
		super();
		
		this.name = name;
		this.price = price;
		this.feature = feature;
	}
	

	public Product1() {
		super();
	}


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID",unique = true,nullable = false)
	private Integer employeeId;

	@Column(name = "NAME",unique = true,nullable = false,length = 100)
	private String name;

	@Column(name = "PRICE",unique = true,nullable = false,length = 100)
	private double price;

	@Column(name = "FEATURE",unique = true,nullable = false,length = 100)
	private String feature;

	public Integer getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getFeature() {
		return feature;
	}


	public void setFeature(String feature) {
		this.feature = feature;
	}



	
}
