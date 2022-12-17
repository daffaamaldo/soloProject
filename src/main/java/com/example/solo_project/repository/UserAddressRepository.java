package com.example.solo_project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.solo_project.model.UserAddress;


public interface UserAddressRepository extends JpaRepository<UserAddress, String>{
	public List<UserAddress>  findByIsDefault(Integer isDefault);
	
	public UserAddress findByUserIdAndIsDefault (String userId, Integer isDefault);
	
	public UserAddress findByUserId(String userId);
}
