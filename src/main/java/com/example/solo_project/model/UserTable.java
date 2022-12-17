package com.example.solo_project.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "TABLE_USER", schema = "PROJECT")
@Entity
public class UserTable {
	
	@Id
	@Column(name = "USER_ID")
	private String userId;
	
	@Column(name = "PASSWORD")
	private String password;
	
	@Column(name = "NO_TELP")
	private String noTelp;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "NAMA")
	private String nama;
	
	@Column(name = "TGL_LAHIR")
	private Date tglLahir;
	
	@Column(name = "KARTU_KREDIT")
	private Integer kartuKredit;	
	
	@Column(name = "IS_ROLE")
	private Integer isRole;
	

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNoTelp() {
		return noTelp;
	}

	public void setNoTelp(String noTelp) {
		this.noTelp = noTelp;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public Date getTglLahir() {
		return tglLahir;
	}

	public void setTglLahir(Date tglLahir) {
		this.tglLahir = tglLahir;
	}

	public Integer getKartuKredit() {
		return kartuKredit;
	}

	public void setKartuKredit(Integer kartuKredit) {
		this.kartuKredit = kartuKredit;
	}

	public Integer getIsRole() {
		return isRole;
	}

	public void setIsRole(Integer isRole) {
		this.isRole = isRole;
	}





	
}
