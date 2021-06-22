package com.capgemini.onetoone;

import java.util.Scanner;


import com.capgemini.onetoone.dao.CustomersDao;
import com.capgemini.onetoone.entity.Address;
import com.capgemini.onetoone.entity.Customers;

/**
 * @author SNEHA
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Address address1=new Address("12,Main St., Houston TX 77001 ");
    	Address address2=new Address("1007 Mountain Dr., Goutham NY 10286");
    	Customers customers1=new Customers("John Doe",address1);
    	Customers customers2=new Customers("Bruce Wayne",address2);
    	CustomersDao customersDao=new CustomersDao();
    	customers1.setAddress(address1);
    	customers2.setAddress(address2);
    	customersDao.saveCustomers(customers1);
    	customersDao.saveCustomers(customers2);
    	
			
		/*
		 * Scanner sc = new Scanner(System.in); char ch = 'y'; while(ch == 'y') {
		 * System.out.println("Enter the transaction");
		 * System.out.println("insert : insert data");
		 * System.out.println("update : update data");
		 * System.out.println("delete : delete data");
		 * System.out.println("get : get a instructor by id");
		 * System.out.println("getall : get all instructor data");
		 * System.out.println("exit : to exit"); String choice = sc.next();
		 * 
		 * switch(choice) { case "insert": customers.setAddress(address);
		 * customersDao.saveCustomers(customers); break; case "update": customers =new
		 * Customers(110,"Damon"); customersDao.updateInstructor(customers); break; case
		 * "delete": System.out.println("Enter the Instructor Id"); int did =
		 * sc.nextInt(); customersDao.deleteCustomers(did); break; case "get":
		 * System.out.println("Enter the Instructor Id"); int cid = sc.nextInt();
		 * Customers custstr = customersDao.getCustomers(cid);
		 * System.out.println(custstr.getCustomer_id()+"\t\t"
		 * +custstr.getCustomer_name());
		 * System.out.println(custstr.getAddress().getAddress_id());
		 * System.out.println(custstr.getAddress().getAddress()); break;
		 * 
		 * case "getall": customersDao.getAllCustomers(); break; case "exit":
		 * System.exit(0); } System.out.println("do you want to continue"); ch
		 * =sc.next().trim().charAt(0); }
		 */
			 
    }
}
