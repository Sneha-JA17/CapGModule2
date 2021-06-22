package com.capgemini.springboothandson.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.springboothandson.model.Wallet;

@RestController
@RequestMapping("/wallet")
public class WalletController {
	
List<Wallet> walletList = new ArrayList<Wallet>();
	
	@RequestMapping("/showwallet")
	public List<Wallet> showWallet(){
		
		Wallet w1 = new Wallet(10001,"Paytm",580);
		Wallet w2 = new Wallet(10002,"Phone Pe",650);
		
		walletList.add(w1);
		walletList.add(w2);
		
		return walletList;
				
	}

	@RequestMapping("/showwalletbyid/{id}")
	public Wallet showOrderById(@PathVariable("id") int id) {
		
		Wallet w = new Wallet();
		System.out.println("searching wallet by id "+id);
		for(int i=0;i<walletList.size();i++) {
			System.out.println("in order by id for loop");
			if(walletList.get(i).getWalid()==id) {
				w=walletList.get(i);
				System.out.println(w.getWalid());
			}
		}
		return w;
	}

}

