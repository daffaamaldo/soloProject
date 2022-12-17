package com.example.solo_project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "ORDERS", schema = "PROJECT")
@Entity
public class Orders {
	
	@Id
	@Column(name = "O_ID")
	private String oId;
	
	@Column(name = "USER_ID")
	private String userId;
	
	@Column(name = "TOTAL_PRICE")
	private Integer totalPrice;
	
	@Column(name = "COST")
	private Integer cost;
	
	@Column(name = "TOTAL_COST")
	private Integer totalCost;

	public String getoId() {
		return oId;
	}

	public void setoId(String oId) {
		this.oId = oId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Integer totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}

	public Integer getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(Integer totalCost) {
		this.totalCost = totalCost;
	}

	
	
}
