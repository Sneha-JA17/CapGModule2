package com.capgemini.springboothandson.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.springboothandson.model.Order;

@RestController
@RequestMapping("/order")
public class OrderController {
	
List<Order> orderList = new ArrayList<Order>();
	
	@RequestMapping("/showorder")
	public List<Order> showOrder(){
		
		Order o1 = new Order(555,"District 9 DVD",156.78);
		Order o2 = new Order(556,"Batarang",99.99);
		
		orderList.add(o1);
		orderList.add(o2);
		
		return orderList;
		
	}

	@RequestMapping("/showorderbyid/{id}")
	public Order showOrderById(@PathVariable("id") int id) {
		
		Order o = new Order();
		System.out.println("searching order by id "+id);
		for(int i=0;i<orderList.size();i++) {
			System.out.println("in order by id for loop");
			if(orderList.get(i).getOrdid()==id) {
				
				o=orderList.get(i);
				System.out.println(o.getOrdid());
			}
		}
		return o;
	}


}
