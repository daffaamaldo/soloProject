package com.example.solo_project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.solo_project.model.Product;

public interface ProductRepository extends JpaRepository<Product, String>{
	public List<Product> findByCatId(String catId);
	public List<Product> findByNamaP(String namaP);
	public Product findBypId(String pId);
}
