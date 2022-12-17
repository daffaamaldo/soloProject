package com.example.solo_project.service;

import java.util.List;

import com.example.solo_project.model.UserAddress;

public interface UserAddressService {

	public List<UserAddress> findAll();
	
	public String regUserAddress(UserAddress req) ;

	public String updUserAddress(UserAddress req);
	
	public String delUserAddress(String id);
	
	public List<UserAddress> getByIsDefault(Integer defaultt);
}
