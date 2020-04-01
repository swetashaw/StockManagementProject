package com.project.stockmanagement.entity;

import java.io.Serializable;
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
@Entity
@Table(name = "user_stocks")
public class UserStocks implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
		
	@ManyToOne(optional = true, cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)

    @JoinColumn(name = "user_id", referencedColumnName = "user_id")

    private User users;


    @ManyToOne(optional = true, cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)

    @JoinColumn(name = "stock_id", referencedColumnName = "id")

    private Stock stocks;

	

	@Column(name = "stock_name")
	private String stockName;

	@Column(name = "total_quantity")
	private double total_quantity;
	
	
	@Column(name="total_price")
	private double total_price;
	
	@Column(name="purchased_on")
	private Date purchasedOn;

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

	public User getUsers() {
		return users;
	}

	public void setUsers(User users) {
		this.users = users;
	}

	public Stock getStocks() {
		return stocks;
	}

	public void setStocks(Stock stocks) {
		this.stocks = stocks;
	}
	

	
}
