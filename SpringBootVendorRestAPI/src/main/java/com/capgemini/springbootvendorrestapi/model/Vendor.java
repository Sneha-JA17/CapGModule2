package com.capgemini.springbootvendorrestapi.model;
public class Vendor {
	
	private int venId;
	private String venName;
	private long venMobileNo;
	private String venType;
	private String venCategory;
	private String venEmailId;
	
	public Vendor() {
		super();
	}

	public Vendor(int venId, String venName, long venMobileNo, String venType, String venCategory, String venEmailId) {
		super();
		this.venId = venId;
		this.venName = venName;
		this.venMobileNo = venMobileNo;
		this.venType = venType;
		this.venCategory = venCategory;
		this.venEmailId = venEmailId;
	}

	public int getVenId() {
		return venId;
	}

	public void setVenId(int venId) {
		this.venId = venId;
	}

	public String getVenName() {
		return venName;
	}

	public void setVenName(String venName) {
		this.venName = venName;
	}

	public long getVenMobileNo() {
		return venMobileNo;
	}

	public void setVenMobileNo(long venMobileNo) {
		this.venMobileNo = venMobileNo;
	}

	public String getVenType() {
		return venType;
	}

	public void setVenType(String venType) {
		this.venType = venType;
	}

	public String getVenCategory() {
		return venCategory;
	}

	public void setVenCategory(String venCategory) {
		this.venCategory = venCategory;
	}

	public String getVenEmailId() {
		return venEmailId;
	}

	public void setVenEmailId(String venEmailId) {
		this.venEmailId = venEmailId;
	}
	
	

}