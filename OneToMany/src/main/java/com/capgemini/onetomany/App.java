package com.capgemini.onetomany;

import java.util.ArrayList;
import java.util.List;
import com.capgemini.onetomany.dao.CustomermasterDao;
import com.capgemini.onetomany.dao.OrdersDao;
import com.capgemini.onetomany.entity.Customermaster;
import com.capgemini.onetomany.entity.Orders;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Customermaster cust1=new Customermaster("John Doe");
    	Customermaster cust2=new Customermaster("Bruce Wayne");
    	
    	Orders orders1=new Orders(cust1,"12/24/09",156.78);
    	Orders orders2=new Orders(cust2,"12/25/09",99.99);
    	Orders orders3=new Orders( cust1,"12/26/09",75.00);
    	
    	OrdersDao ordersdao=new OrdersDao();
    	
    	ordersdao.saveOrders(orders1);
    	ordersdao.saveOrders(orders2);
    	ordersdao.saveOrders(orders3);
    	
    	
    	
    	
    }
}
