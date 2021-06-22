package com.capgemini.onetomany.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.capgemini.onetomany.entity.Customermaster;
import com.capgemini.onetomany.util.HibernateUtil;




public class CustomermasterDao {
	//inserting the customers
		public void saveCustomers(Customermaster customermaster) {
			Transaction transaction = null;
			try {
				Session session = HibernateUtil.getSessionFactory().openSession();
				//start transaction
				transaction =  session.beginTransaction();
				//save the instructor object
				session.save(customermaster);
				//commit the transaction
				transaction.commit();
			}catch (Exception e) {
				if(transaction != null) {
					transaction.rollback();
				}
				e.printStackTrace();
			}
		}
		
		
		
		public void updateInstructor(Customermaster customermaster) {
			Transaction transaction = null;
			try {
				Session session = HibernateUtil.getSessionFactory().openSession();
				//start transaction
				transaction =  session.beginTransaction();
				//save the instructor object
				session.saveOrUpdate(customermaster);
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
				Customermaster customermaster = session.get(Customermaster.class, id);
				//delete the instructor object
				session.delete(customermaster);
				//commit the transaction
				transaction.commit();
			}catch (Exception e) {
				if(transaction != null) {
					transaction.rollback();
				}
				e.printStackTrace();
			}
			
		}
		public Customermaster getCustomers(int id) {
			Transaction transaction = null;
			Customermaster customers = null;
			try {
				Session session = HibernateUtil.getSessionFactory().openSession();
				//start transaction
				transaction =  session.beginTransaction();
				//get instructor using id
				customers =session.get(Customermaster.class, id);

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
		public List<Customermaster> getAllCustomers() {
			List<Customermaster> custs = null;
		    //read data from table instructor using Hibernate  
	        try {
	        	Session session = HibernateUtil.getSessionFactory().openSession();
	        	custs = session.createQuery("from customermaster",Customermaster.class).list();
	        	custs.forEach(instr -> System.out.println(instr));
	        
	        }catch(Exception e) {
	        	e.printStackTrace();
	        }
			return custs;
		}

}
