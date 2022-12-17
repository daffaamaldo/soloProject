package com.example.solo_project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.solo_project.model.UserTable;

public interface UserTableRepository extends JpaRepository<UserTable, String>{
	
	public List<UserTable> findByNama(String nama);
	
	public UserTable findByUserId(String userId);
}
