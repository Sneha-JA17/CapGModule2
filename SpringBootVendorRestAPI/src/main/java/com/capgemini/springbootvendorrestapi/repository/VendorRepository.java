package com.capgemini.springbootvendorrestapi.repository;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.capgemini.springbootvendorrestapi.model.Vendor;



@Repository
public class VendorRepository implements IVendorRepository{

	List<Vendor> vendorList = new ArrayList<Vendor>();
	
	@Override
	public List<Vendor> getallVendors() {
		// TODO Auto-generated method stub
		return vendorList;
	}

	@Override
	public Vendor getVendorById(int id) {
		// TODO Auto-generated method stub
		int index = -1 ;
		Vendor result = null ;
		for(int i=0;i<vendorList.size();i++) {
			if(vendorList.get(i).getVenId() == id) {
				index = i;
				result = vendorList.get(i);
			}
		}
		return result;
	}

	@Override
	public Vendor addVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		vendorList.add(vendor);
		return vendor;
	}

	@Override
	public Vendor updateVendorById(Vendor vendor,int id) {
		// TODO Auto-generated method stub
		int index = -1 ;
		Vendor result = null ;
		for(int i=0;i<vendorList.size();i++) {
			if(vendorList.get(i).getVenId() == id) {
				index = i;
				vendorList.set(i,vendor);
			}
		}
		
		return vendor;
	}

	@Override
	public Vendor deleteVendor(int id) {
		// TODO Auto-generated method stub
		int index = -1 ;
		Vendor result = null ;
		for(int i=0;i<vendorList.size();i++) {
			if(vendorList.get(i).getVenId() == id) {
				index = i;
				result = vendorList.get(i);
			}
		}
		vendorList.remove(index);
		return result;
	}

	@Override
	public Vendor deleteVendorByCategory(String category) {
		// TODO Auto-generated method stub
		int index = -1 ;
		Vendor result = null ;
		for(int i=0;i<vendorList.size();i++) {
			if(vendorList.get(i).getVenCategory().equalsIgnoreCase(category)) {
				index = i;
				result = vendorList.get(i);
			}
		}
		vendorList.remove(index);
		return result;
	}

	@Override
	public Vendor deletePermanentVendors() {
		// TODO Auto-generated method stub
		int index = -1 ;
		Vendor result = null ;
		for(int i=0;i<vendorList.size();i++) {
			if(vendorList.get(i).getVenType().equalsIgnoreCase("permanent")) {
				index = i;
				result = vendorList.get(i);
			}
		}
		vendorList.remove(index);
		return result;
	}

	@Override
	public Vendor getVendor(char c) {
		// TODO Auto-generated method stub
		int index = -1 ;
		Vendor result = null ;
		for(int i=0;i<vendorList.size();i++) {
			if(vendorList.get(i).getVenName().substring(0, 1).equalsIgnoreCase(""+c)) {
				index = i;
				result = vendorList.get(i);
			}
		}
		return result;
	}

	@Override
	public Vendor getVendorByMobileNumber(long num) {
		// TODO Auto-generated method stub
		int index = -1 ;
		Vendor result = null ;
		for(int i=0;i<vendorList.size();i++) {
			if(vendorList.get(i).getVenMobileNo()==num) {
				index = i;
				result = vendorList.get(i);
			}
		}
		return result;
	}

}