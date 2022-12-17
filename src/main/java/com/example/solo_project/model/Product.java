package com.example.solo_project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Table(name = "PRODUCT", schema = "PROJECT")
@Entity
public class Product {
	
	@Id
	@Column(name = "P_ID")
	private String pId;
	
	@Column(name = "CAT_ID")
	private String catId;
	
	@Column(name = "NAMA_P")
	private String namaP;
	
	@Column(name = "PRICE")
	private Integer price;

	@Column(name = "QTY_AVAIL")
	private Integer qtyAvail;
	
	@Column(name = "ALAMAT_P")
	private String alamatP;
	
	@Lob
	@Column(name = "GAMBAR", length = 1000)
	private byte[] gambar;

	public String getpId() {
		return pId;
	}

	public void setpId(String pId) {
		this.pId = pId;
	}

	public String getCatId() {
		return catId;
	}

	public void setCatId(String catId) {
		this.catId = catId;
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

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getQtyAvail() {
		return qtyAvail;
	}

	public void setQtyAvail(Integer qtyAvail) {
		this.qtyAvail = qtyAvail;
	}

	public String getAlamatP() {
		return alamatP;
	}

	public void setAlamatP(String alamatP) {
		this.alamatP = alamatP;
	}

	public byte[] getGambar() {
		return gambar;
	}

	public void setGambar(byte[] gambar) {
		this.gambar = gambar;
	}

	
	
	
}
