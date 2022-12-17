package com.example.solo_project.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.solo_project.model.UserAddress;
import com.example.solo_project.repository.UserAddressRepository;
import com.example.solo_project.service.UserAddressService;

@Service
public class UserAddressServiceImpl implements UserAddressService{
	
	@Autowired
	UserAddressRepository userAddressRepository;
	
	@Override
	public List<UserAddress> findAll() {
		// TODO Auto-generated method stub
		return userAddressRepository.findAll();
	}

	@Override
	public String regUserAddress(UserAddress req) {
		// TODO Auto-generated method stub
		String result = "Failed to register User Address Data!";
		if (req != null) {
			userAddressRepository.save(req);
			result = "Success to register User Address Data!";
		}
		return result;
		
	}

	@Override
	public String updUserAddress(UserAddress req) {
		// TODO Auto-generated method stub
		String result = "Failed to update User Address Data!";
		
		Optional<UserAddress> optUserAddress = userAddressRepository.findById(req.getIdAlamat());
				if(optUserAddress.isPresent()) {
					userAddressRepository.save(req);
					result = "Success to update User Address Data!";
				}
		return result;
	}

	@Override
	public String delUserAddress(String id) {
		// TODO Auto-generated method stub
		String result = "Failed to delete User Address Data!";
		
		Optional<UserAddress> optUserAddress = userAddressRepository.findById(id);
		if (optUserAddress.isPresent()) {
			userAddressRepository.deleteById(id);
			result = "Success to delete User Address Data!";
		}
		return result;
		
	}

	@Override
	public List<UserAddress> getByIsDefault(Integer defaultt) {
		// TODO Auto-generated method stub
		return userAddressRepository.findByIsDefault(defaultt);
	}
	

}
