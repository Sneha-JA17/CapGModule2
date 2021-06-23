package com.capgemini.springbootvendorrestapi.repository;

import java.util.List;

import com.capgemini.springbootvendorrestapi.model.Vendor;

public interface IVendorRepository {
	
	public List<Vendor> getallVendors();
	public Vendor getVendorById(int id);
	public Vendor addVendor(Vendor vendor);
	public Vendor updateVendorById(Vendor vendor,int id);
	public Vendor deleteVendor(int id);
	public Vendor deleteVendorByCategory(String category);
	public Vendor deletePermanentVendors();
	public Vendor getVendor(char c);
	public Vendor getVendorByMobileNumber(long num);

}



