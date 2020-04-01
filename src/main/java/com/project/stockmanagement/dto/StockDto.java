package com.project.stockmanagement.dto;

import java.util.ArrayList;
import java.util.List;

import com.project.stockmanagement.entity.UserStocks;

/**
 * @author Sweta
 *
 */

public class StockDto {

	
	private Long id;
   
	
	private String stockName;

	
	private double pricePerUnit;

	

	
	private int quantity;
	
	
	private boolean isActive;
	
	
	/* List<UserStocks> userStocks = new ArrayList<UserStocks>(); */

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/*
	 * public List<UserStocks> getUserStocks() { return userStocks; }
	 * 
	 * public void setUserStocks(List<UserStocks> userStocks) { this.userStocks =
	 * userStocks; }
	 */

	

}
