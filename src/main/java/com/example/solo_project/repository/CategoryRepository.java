package com.example.solo_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.solo_project.model.Category;

public interface CategoryRepository extends JpaRepository<Category, String>{

}
