package com.example.solo_project.dto;

public class cartDto {
	//table user
	private String name;
	private Integer creditCard;
	private String noTelp;
	//table user / table alamat
	private String userAddress;
	
	//table product
	private String namaP;
	private Integer price;
	private String alamatP;
	
	//table usp is_active
	private Integer qtyCart;
	private Integer totalPrice;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(Integer creditCard) {
		this.creditCard = creditCard;
	}
	public String getNoTelp() {
		return noTelp;
	}
	public void setNoTelp(String noTelp) {
		this.noTelp = noTelp;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getNamaP() {
		return namaP;
	}
	public void setNamaP(String namaP) {
		this.namaP = namaP;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer integer) {
		this.price = integer;
	}
	public String getAlamatP() {
		return alamatP;
	}
	public void setAlamatP(String alamatP) {
		this.alamatP = alamatP;
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
	
	
	
	
	
}
