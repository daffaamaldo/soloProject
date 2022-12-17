package com.example.solo_project.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.solo_project.model.Category;
import com.example.solo_project.repository.CategoryRepository;
import com.example.solo_project.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	CategoryRepository userAddressRepository;
	
	@Override
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return userAddressRepository.findAll();
	}

	@Override
	public String regCategory(Category req) {
		// TODO Auto-generated method stub
		String result = "Failed to register Category Data!";
		if (req != null) {
			userAddressRepository.save(req);
			result = "Success to register Category Data!";
		}
		return result;
		
	}

	@Override
	public String updCategory(Category req) {
		// TODO Auto-generated method stub
		String result = "Failed to update Category Data!";
		
		Optional<Category> optCategory = userAddressRepository.findById(req.getCatId());
				if(optCategory.isPresent()) {
					userAddressRepository.save(req);
					result = "Success to update Category Data!";
				}
		return result;
	}

	@Override
	public String delCategory(String id) {
		// TODO Auto-generated method stub
		String result = "Failed to delete Category Data!";
		
		Optional<Category> optCategory = userAddressRepository.findById(id);
		if (optCategory.isPresent()) {
			userAddressRepository.deleteById(id);
			result = "Success to delete Category Data!";
		}
		return result;
		
	}
	

}
