package com.capgemini.springbootvendorrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.springbootvendorrestapi.model.Vendor;
import com.capgemini.springbootvendorrestapi.service.IVendorService;




@RestController
@RequestMapping("/vendor")
public class VendorController {
	
	@Autowired
	public IVendorService vs;
	
	@GetMapping("/getallvendors")
	public List<Vendor> getallVendors() {
		// TODO Auto-generated method stub
		return vs.getallVendors();
	}

	@GetMapping("/getvendorbyid/{id}")
	public Vendor getVendorById(@PathVariable("id") int id) {
		// TODO Auto-generated method stub
		return vs.getVendorById(id);
	}

	@PostMapping("/addvendor")
	public Vendor addVendor(@RequestBody Vendor vendor) {
		// TODO Auto-generated method stub
		return vs.addVendor(vendor);
	}

	@PutMapping("/updatevendorbyid/{id}")
	public Vendor updateVendor(@RequestBody Vendor vendor,@PathVariable("id") int id) {
		// TODO Auto-generated method stub
		return vs.updateVendorById(vendor,id);
	}

	@DeleteMapping("/deletevendor/{id}")
	public Vendor deleteVendor(@PathVariable("id") int id) {
		// TODO Auto-generated method stub
		return vs.deleteVendor(id);
	}

	@DeleteMapping("/deletevendorbycategory/{category}")
	public Vendor deleteVendorByCategory(@PathVariable("category") String category) {
		// TODO Auto-generated method stub
		return vs.deleteVendorByCategory(category);
	}

	@DeleteMapping("/deletepermanentvendors")
	public Vendor deletePermanentVendors() {
		// TODO Auto-generated method stub
		return vs.deletePermanentVendors();
	}

	@GetMapping("/getvendorbyfirstcharacter/{character}")
	public Vendor getVendor(@PathVariable("character") char c) {
		// TODO Auto-generated method stub
		return vs.getVendor(c);
	}

	@GetMapping("/getvendorbymobileno/{mobno}")
	public Vendor getVendorByMobileNumber(@PathVariable("mobno") long num) {
		// TODO Auto-generated method stub
		return vs.getVendorByMobileNumber(num);
	}

	
	

}