package com.example.solo_project.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.solo_project.model.UserTable;
import com.example.solo_project.repository.UserTableRepository;
import com.example.solo_project.service.UserTableService;

@Service
public class UserTableServiceImpl implements UserTableService{
	
	@Autowired
	UserTableRepository userTableRepository;
	
	@Override
	public List<UserTable> findAll() {
		// TODO Auto-generated method stub
		return userTableRepository.findAll();
	}

	@Override
	public String regUserTable(UserTable req) {
		// TODO Auto-generated method stub
		String result = "Failed to register User Table Data!";
		if (req != null) {
			userTableRepository.save(req);
			result = "Success to register User Table Data!";
		}
		return result;
		
	}

	@Override
	public String updUserTable(UserTable req) {
		// TODO Auto-generated method stub
		String result = "Failed to update User Table Data!";
		
		Optional<UserTable> optUserTable = userTableRepository.findById(req.getUserId());
				if(optUserTable.isPresent()) {
					userTableRepository.save(req);
					result = "Success to update User Table Data!";
				}
		return result;
	}

	@Override
	public String delUserTable(String id) {
		// TODO Auto-generated method stub
		String result = "Failed to delete User Table Data!";
		
		Optional<UserTable> optUserTable = userTableRepository.findById(id);
		if (optUserTable.isPresent()) {
			userTableRepository.deleteById(id);
			result = "Success to delete User Table Data!";
		}
		return result;
		
	}

	@Override
	public List<UserTable> getByNama(String nama) {
		return userTableRepository.findByNama(nama);

	}

	@Override
	public UserTable getByUserId(String userId) {
		// TODO Auto-generated method stub
		return userTableRepository.findByUserId(userId);
	}
	

}
