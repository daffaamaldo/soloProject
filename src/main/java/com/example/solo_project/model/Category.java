package com.example.solo_project.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "CATEGORY", schema = "PROJECT")
@Entity
public class Category {
	
	@Id
	@Column(name = "CAT_ID")
	private String catId;
	
	@Column(name = "NAMA_CAT")
	private String namaCat;

	public String getCatId() {
		return catId;
	}

	public void setCatId(String catId) {
		this.catId = catId;
	}

	public String getNamaCat() {
		return namaCat;
	}

	public void setNamaCat(String namaCat) {
		this.namaCat = namaCat;
	}
	
	
}
