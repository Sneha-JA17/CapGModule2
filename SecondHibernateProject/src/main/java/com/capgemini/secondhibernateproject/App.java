package com.capgemini.secondhibernateproject;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.capgemini.secondhibernateproject.entity.Product1;
import com.capgemini.secondhibernateproject.util.HibernateUtil;





public class App
{
public static void main( String[] args )
{
Product1 prd = new Product1("Laptop",40000, "Windows10");
Product1 prd1 = new Product1("Headphone", 2000, "BOAT");
Transaction transaction = null;
try {
Session session = HibernateUtil.getSessionFactory().openSession();
//start a transaction
transaction = session.beginTransaction();
//save the employee objects in to table
session.save(prd);
session.save(prd1);
//commit transaction
transaction.commit();

}catch(Exception e) {
if(transaction != null) {
transaction.rollback();
}
e.printStackTrace();
}//catch close


  //read data from table Employee using Hibernate  
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Product1> products = session.createQuery("from Product1",Product1.class).list();
        products.forEach(pr -> System.out.println(pr.getName()));

    }catch(Exception e) {
        e.printStackTrace();
    }
}
}