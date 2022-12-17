package com.example.solo_project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "ALAMAT_USER", schema = "PROJECT")
@Entity
public class UserAddress {
	
	@Id
	@Column(name = "ID_ALAMAT")
	private String idAlamat;
	
	@Column(name = "ALAMAT")
	private String alamat;
	
	@Column(name = "USER_ID")
	private String userId;
	
	@Column(name = "IS_DEFAULT")
	private Integer isDefault;

	public String getIdAlamat() {
		return idAlamat;
	}

	public void setIdAlamat(String idAlamat) {
		this.idAlamat = idAlamat;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Integer isDefault) {
		this.isDefault = isDefault;
	}

	
	
	
}
