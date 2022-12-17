package com.example.solo_project.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.solo_project.model.Category;
import com.example.solo_project.service.CategoryService;

@RestController
@RequestMapping("api/solo_project/category")
public class CategoryController {
	
	@Autowired
	CategoryService categoryService;
	
	@GetMapping
	public List<Category> findAll(){
		
		return categoryService.findAll();
		
	}
	
	@PostMapping //("localhost:8092/api/solo_project/Category/path") kalau mau spesific
	public String regCategory(@RequestBody Category req) {
		
		return categoryService.regCategory(req);
	}
	
	@PutMapping
	public String updCategory(@RequestBody Category req) {
		
		return categoryService.updCategory(req);
	}
	
	@DeleteMapping("{catId}")
	public String delCategory(@PathVariable String catId) {
		
		return categoryService.delCategory(catId);
	}
}
