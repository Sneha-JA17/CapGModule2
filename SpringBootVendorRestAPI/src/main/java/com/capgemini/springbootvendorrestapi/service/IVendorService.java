package com.capgemini.springbootvendorrestapi.service;



import com.capgemini.springbootvendorrestapi.model.Vendor;


import java.util.List;



public interface IVendorService {
	
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
