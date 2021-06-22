package com.capgemini.onetomany.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.capgemini.onetomany.entity.Orders;
import com.capgemini.onetomany.util.HibernateUtil;



public class OrdersDao {

	//inserting the customers
		public void saveOrders(Orders orders) {
			Transaction transaction = null;
			try {
				Session session = HibernateUtil.getSessionFactory().openSession();
				//start transaction
				transaction =  session.beginTransaction();
				//save the instructor object
				session.save(orders);
				//commit the transaction
				transaction.commit();
			}catch (Exception e) {
				if(transaction != null) {
					transaction.rollback();
				}
				e.printStackTrace();
			}
		}
		
		
		
		public void updateOrders(Orders orders) {
			Transaction transaction = null;
			try {
				Session session = HibernateUtil.getSessionFactory().openSession();
				//start transaction
				transaction =  session.beginTransaction();
				//save the instructor object
				session.saveOrUpdate(orders);
				//commit the transaction
				transaction.commit();
			}catch (Exception e) {
				if(transaction != null) {
					transaction.rollback();
				}
				e.printStackTrace();
			}
			
		}
		public void deleteOrders(int id) {
			Transaction transaction = null;
			try {
				Session session = HibernateUtil.getSessionFactory().openSession();
				//start transaction
				transaction =  session.beginTransaction();
				//get instructor using id
				Orders orders = session.get(Orders.class, id);
				//delete the instructor object
				session.delete(orders);
				//commit the transaction
				transaction.commit();
			}catch (Exception e) {
				if(transaction != null) {
					transaction.rollback();
				}
				e.printStackTrace();
			}
			
		}
		public Orders getOrders(int id) {
			Transaction transaction = null;
			Orders orders = null;
			try {
				Session session = HibernateUtil.getSessionFactory().openSession();
				//start transaction
				transaction =  session.beginTransaction();
				//get instructor using id
				orders =session.get(Orders.class, id);

				//commit the transaction
				transaction.commit();
			}catch (Exception e) {
				if(transaction != null) {
					transaction.rollback();
				}
				e.printStackTrace();
			}
			return orders;
			
		}
		public List<Orders> getAllOrders() {
			List<Orders> orders = null;
		    //read data from table instructor using Hibernate  
	        try {
	        	Session session = HibernateUtil.getSessionFactory().openSession();
	        	orders= session.createQuery("from Orders",Orders.class).list();
	        	orders.forEach(odr -> System.out.println(odr));
	        
	        }catch(Exception e) {
	        	e.printStackTrace();
	        }
			return orders;
		}

	}

