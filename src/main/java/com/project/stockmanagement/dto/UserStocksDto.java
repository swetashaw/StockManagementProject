package com.project.stockmanagement.dto;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Sweta
 *
 */

public class UserStocksDto {

	
	private Long id;
	
	private long userid;

	private long stockid;

	private String stockName;

	private double total_quantity;
	
	
	private double total_price;
	
	private Date purchasedOn;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public long getUserid() {
		return userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}

	public long getStockid() {
		return stockid;
	}

	public void setStockid(long stockid) {
		this.stockid = stockid;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public double getTotal_quantity() {
		return total_quantity;
	}

	public void setTotal_quantity(double total_quantity) {
		this.total_quantity = total_quantity;
	}

	public double getTotal_price() {
		return total_price;
	}

	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}

	public Date getPurchasedOn() {
		return purchasedOn;
	}

	public void setPurchasedOn(Date purchasedOn) {
		this.purchasedOn = purchasedOn;
	}


	

	
}
