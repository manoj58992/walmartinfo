package com.walmart.dto;

public class WalmartDTO {
	private int id;
	private String name;
	private String location;
	private String phonenum;
	private String products;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}

	public String getProducts() {
		return products;
	}

	public void setProducts(String products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "WalmartDTO [id=" + id + ", name=" + name + ", location=" + location + ", phonenum=" + phonenum
				+ ", products=" + products + "]";
	}

}
