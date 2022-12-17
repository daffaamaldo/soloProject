package com.example.solo_project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.solo_project.model.UserProductCart;

public interface UserProductCartRepository extends JpaRepository<UserProductCart, String>{
	public List<UserProductCart> findByUpcId(String upcId);
	public List<UserProductCart> findByUserId(String userId);
}
