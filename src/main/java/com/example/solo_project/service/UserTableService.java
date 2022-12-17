package com.example.solo_project.service;

import java.util.List;

import com.example.solo_project.model.UserTable;

public interface UserTableService {

	public List<UserTable> findAll();
	
	public String regUserTable(UserTable req) ;

	public String updUserTable(UserTable req);
	
	public String delUserTable(String id);
	
	public List<UserTable> getByNama(String nama);
	
	public UserTable getByUserId(String userId);
	
}
