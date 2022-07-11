package com.simplilearn.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

public class EProductEntity {

	private long id;
	private String name;
	private BigDecimal price;
	private Timestamp dateAdded;
	public EProductEntity() {	}
	public EProductEntity(String name, BigDecimal price, Timestamp dateAdded) {
		super();
		this.name = name;
		this.price = price;
		this.dateAdded = dateAdded;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Date getDateAdded() {
		return dateAdded;
	}
	public void setDateAdded(Timestamp dateAdded) {
		this.dateAdded = dateAdded;
	}
	
}