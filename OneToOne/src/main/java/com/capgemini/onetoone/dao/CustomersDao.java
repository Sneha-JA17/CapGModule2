package com.capgemini.onetoone.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.capgemini.onetoone.entity.Customers;
import com.capgemini.onetoone.util.HibernateUtil;



public class CustomersDao {
	//inserting the customers
		public void saveCustomers(Customers customers) {
			Transaction transaction = null;
			try {
				Session session = HibernateUtil.getSessionFactory().openSession();
				//start transaction
				transaction =  session.beginTransaction();
				//save the instructor object
				session.save(customers);
				//commit the transaction
				transaction.commit();
			}catch (Exception e) {
				if(transaction != null) {
					transaction.rollback();
				}
				e.printStackTrace();
			}
		}
		
		
		
		public void updateInstructor(Customers customers) {
			Transaction transaction = null;
			try {
				Session session = HibernateUtil.getSessionFactory().openSession();
				//start transaction
				transaction =  session.beginTransaction();
				//save the instructor object
				session.saveOrUpdate(customers);
				//commit the transaction
				transaction.commit();
			}catch (Exception e) {
				if(transaction != null) {
					transaction.rollback();
				}
				e.printStackTrace();
			}
			
		}
		public void deleteCustomers(int id) {
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
		public Customers getCustomers(int id) {
			Transaction transaction = null;
			Customers customers = null;
			try {
				Session session = HibernateUtil.getSessionFactory().openSession();
				//start transaction
				transaction =  session.beginTransaction();
				//get instructor using id
				customers =session.get(Customers.class, id);

				//commit the transaction
				transaction.commit();
			}catch (Exception e) {
				if(transaction != null) {
					transaction.rollback();
				}
				e.printStackTrace();
			}
			return customers;
			
		}
		public List<Customers> getAllCustomers() {
			List<Customers> custs = null;
		    //read data from table instructor using Hibernate  
	        try {
	        	Session session = HibernateUtil.getSessionFactory().openSession();
	        	custs = session.createQuery("from Instructor",Customers.class).list();
	        	custs.forEach(instr -> System.out.println(instr));
	        
	        }catch(Exception e) {
	        	e.printStackTrace();
	        }
			return custs;
		}

}
