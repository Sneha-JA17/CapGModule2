package com.capgemini.springbootvendorrestapi.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.springbootvendorrestapi.model.Vendor;
import com.capgemini.springbootvendorrestapi.repository.IVendorRepository;



@Service
public class VendorService implements IVendorService{
	
	@Autowired
	IVendorRepository ivr;


	@Override
	public List<Vendor> getallVendors() {
		// TODO Auto-generated method stub
		return ivr.getallVendors();
	}

	@Override
	public Vendor getVendorById(int id) {
		// TODO Auto-generated method stub
		return ivr.getVendorById(id);
	}

	@Override
	public Vendor addVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		return ivr.addVendor(vendor);
	}

	@Override
	public Vendor updateVendorById(Vendor vendor,int id) {
		// TODO Auto-generated method stub
		return ivr.updateVendorById(vendor,id);
	}

	@Override
	public Vendor deleteVendor(int id) {
		// TODO Auto-generated method stub
		return ivr.deleteVendor(id);
	}

	@Override
	public Vendor deleteVendorByCategory(String category) {
		// TODO Auto-generated method stub
		return ivr.deleteVendorByCategory(category);
	}

	@Override
	public Vendor deletePermanentVendors() {
		// TODO Auto-generated method stub
		return ivr.deletePermanentVendors();
	}

	@Override
	public Vendor getVendor(char c) {
		// TODO Auto-generated method stub
		return ivr.getVendor(c);
	}

	@Override
	public Vendor getVendorByMobileNumber(long num) {
		// TODO Auto-generated method stub
		return ivr.getVendorByMobileNumber(num);
	}
	

}