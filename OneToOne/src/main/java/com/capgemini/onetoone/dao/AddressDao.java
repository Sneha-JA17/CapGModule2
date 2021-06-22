package com.capgemini.onetoone.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;


import com.capgemini.onetoone.entity.Address;
import com.capgemini.onetoone.entity.Customers;
import com.capgemini.onetoone.util.HibernateUtil;

public class AddressDao {
	//inserting the customers
	public void saveAddress(Address address) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			//start transaction
			transaction =  session.beginTransaction();
			//save the instructor object
			session.save(address);
			//commit the transaction
			transaction.commit();
		}catch (Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
	
	
	
	public void updateAddress(Address address) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			//start transaction
			transaction =  session.beginTransaction();
			//save the instructor object
			session.saveOrUpdate(address);
			//commit the transaction
			transaction.commit();
		}catch (Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		
	}
	public void deleteAddress(int id) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			//start transaction
			transaction =  session.beginTransaction();
			//get instructor using id
			Customers customers = session.get(Customers.class, id);
			//delete the instructor object
			session.delete(customers);
			//commit the transaction
			transaction.commit();
		}catch (Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		
	}
	public Address getAddress(int id) {
		Transaction transaction = null;
		Address address = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			//start transaction
			transaction =  session.beginTransaction();
			//get instructor using id
			address =session.get(Address.class, id);

			//commit the transaction
			transaction.commit();
		}catch (Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return address;
		
	}
	public List<Address> getAllCustomers() {
		List<Address> custs = null;
	    //read data from table instructor using Hibernate  
        try {
        	Session session = HibernateUtil.getSessionFactory().openSession();
        	custs = session.createQuery("from Address",Address.class).list();
        	custs.forEach(instr -> System.out.println(instr));
        
        }catch(Exception e) {
        	e.printStackTrace();
        }
		return custs;
	}

}
