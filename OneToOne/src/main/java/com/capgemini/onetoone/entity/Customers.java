package com.capgemini.onetoone.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;


@Entity
public class Customers {


	
	
		
		@Id
		@SequenceGenerator(name="custSeqGen",sequenceName="custSeq",initialValue=101,allocationSize=100)
		@GeneratedValue(generator="custSeqGen")
		private Integer customer_id;
		private String customer_name;
		
		
		
		@OneToOne(cascade = CascadeType.ALL)
		@JoinColumn(name = "address_id")
		private Address address;

		//@OneToMany(cascade = CascadeType.ALL)
		//@JoinColumn(name = "courseid")
		//private List<Order> courses = new ArrayList<Order>();
		


		public Customers(String customer_name, Address address) {
			super();
			
			this.customer_name = customer_name;
			this.address = address;
		}


		public Customers() {
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


		/*
		 * public Integer getAddress_id() { return address_id; }
		 * 
		 * 
		 * public void setAddress_id(Integer address_id) { this.address_id = address_id;
		 * }
		 */

		public Address getAddress() {
			return address;
		}


		public void setAddress(Address address) {
			this.address = address;
		}


		
		
}
