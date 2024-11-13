package com.pvr.shopping.entity;

public class Customer{
	private int cid;
	private String City;
	private String cname;
	private String product;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", City=" + City + ", cname=" + cname + ", product=" + product + ", getCid()="
				+ getCid() + ", getCity()=" + getCity() + ", getCname()=" + getCname() + ", getProduct()="
				+ getProduct() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}