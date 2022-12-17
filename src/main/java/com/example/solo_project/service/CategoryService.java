package com.example.solo_project.service;

import java.util.List;

import com.example.solo_project.model.Category;

public interface CategoryService {

	public List<Category> findAll();
	
	public String regCategory(Category req) ;

	public String updCategory(Category req);
	
	public String delCategory(String id);
	
}
