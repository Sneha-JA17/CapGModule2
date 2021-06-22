package com.capgemini.springboothandson.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.springboothandson.model.Seller;


@RestController
@RequestMapping("/seller")
public class SellerController {
	

	List<Seller>sellerlist=new ArrayList<Seller>();
	
		
		@RequestMapping("/showseller")
		public List<Seller> showSeller() {
			Seller s1=new Seller(123,"Rama","Kolkata","West Bengal");
			Seller s2=new Seller(124,"Krishna","Malda","West Bengal");
			Seller s3=new Seller(125,"Ram","bengaluru","Karnataka");
	
			sellerlist.add(s1);
			sellerlist.add(s2);
			sellerlist.add(s3);
			
			return sellerlist;
		}

 @RequestMapping("/showsellerbyid/{id}")
 public Seller showSellerById(@PathVariable("id") int id) {
	 Seller s1=new Seller(123,"Rama","Kolkata","West Bengal");
		Seller s2=new Seller(124,"Krishna","Malda","West Bengal");
		Seller s3=new Seller(125,"Ram","bengaluru","Karnataka");

		sellerlist.add(s1);
		sellerlist.add(s2);
		sellerlist.add(s3);
		
		Seller sl1 = new Seller();
		System.out.println("in seller by id");
		for(int i=0;i<sellerlist.size();i++) {
			System.out.println("in employee by id for loop");
			if(sellerlist.get(i).getSid()==id) {
				
				sl1=sellerlist.get(i);
				System.out.println(sl1.getSid());
			}
		}
		return sl1;
	}
 }

	
