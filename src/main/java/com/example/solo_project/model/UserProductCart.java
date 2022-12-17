package com.example.solo_project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "USER_PRODUCT_CART", schema = "PROJECT")
@Entity
public class UserProductCart {
	
	@Id
	@Column(name = "UPC_ID")
	private String upcId;
	
	@Column(name = "P_ID")
	private String pId;
	
	@Column(name = "O_ID")
	private String oId;
	
	@Column(name = "USER_ID")
	private String userId;
	
	@Column(name = "QTY_CART")
	private Integer qtyCart;
	
	@Column(name = "TOTAL_PRICE")
	private Integer totalPrice;
	
	@Column(name = "IS_ACTIVE")
	private Integer isActive;

	public String getUpcId() {
		return upcId;
	}

	public void setUpcId(String upcId) {
		this.upcId = upcId;
	}

	public String getpId() {
		return pId;
	}

	public void setpId(String pId) {
		this.pId = pId;
	}

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

	public Integer getQtyCart() {
		return qtyCart;
	}

	public void setQtyCart(Integer qtyCart) {
		this.qtyCart = qtyCart;
	}

	public Integer getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Integer totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Integer getIsActive() {
		return isActive;
	}

	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}

	
	
	
}
