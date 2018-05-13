package com.farm.entity;

public class ProductType {
	
	private Long id;
	
	private String productTypeName;
	
	private String gmtCreate;
	
	private String gmtModified;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductTypeName() {
		return productTypeName;
	}

	public void setProductTypeName(String productTypeName) {
		this.productTypeName = productTypeName;
	}

	public String getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getGmtModified() {
		return gmtModified;
	}

	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	@Override
	public String toString() {
		return "ProductType [id=" + id + ", productTypeName=" + productTypeName + ", gmtCreate=" + gmtCreate
				+ ", gmtModified=" + gmtModified + "]";
	}
	
	
	
	
}
