package com.capgemini.springboothandson.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.springboothandson.model.Buyer;




@RestController
@RequestMapping("/buyer")
public class BuyerController {
	

	List<Buyer>buyerlist=new ArrayList<Buyer>();
	
		
		@RequestMapping("/showbuyer")
		public List<Buyer> showSeller() {
			Buyer b=new Buyer(1,"Raja","Malda","West Bengal");
			Buyer b1=new Buyer(2,"Raj","Darjeeling","West Bengal");
			Buyer b2=new Buyer(3,"Ranajay","Kolkata","West Bengal");
	
			buyerlist.add(b);
			buyerlist.add(b1);
			buyerlist.add(b2);
			
			return buyerlist;
		}

 @RequestMapping("/showbuyerbyid/{id}")
 public Buyer showBuyerById(@PathVariable("id") int id) {
	 Buyer b=new Buyer(1,"Raja","Malda","West Bengal");
		Buyer b1=new Buyer(2,"Raj","Darjeeling","West Bengal");
		Buyer b2=new Buyer(3,"Ranajay","Kolkata","West Bengal");

		buyerlist.add(b);
		buyerlist.add(b1);
		buyerlist.add(b2);
		
		Buyer sl1 = new Buyer();
		System.out.println("in seller by id");
		for(int i=0;i<buyerlist.size();i++) {
			System.out.println("in employee by id for loop");
			if(buyerlist.get(i).getBid()==id) {
				buyerlist.get(i);
				System.out.println(sl1.getBid());
			}
		}
		return sl1;
	}
 }