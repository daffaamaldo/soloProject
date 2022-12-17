package com.example.solo_project.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.solo_project.model.UserTable;
import com.example.solo_project.service.UserTableService;

@CrossOrigin
@RestController
@RequestMapping("api/solo_project/userTable")
public class UserTableController {
	
	@Autowired
	UserTableService userTableService;
	
	@GetMapping
	public List<UserTable> findAll(){
		
		return userTableService.findAll();
		
	}
	
	@PostMapping("nama/{nama}")
	public List<UserTable> getByNama(@PathVariable String nama) {
		
		return userTableService.getByNama(nama);
	}
	
	
	@PostMapping //("localhost:8092/api/solo_project/UserTable/path") kalau mau spesific
	public String regUserTable(@RequestBody UserTable req) {
		
		return userTableService.regUserTable(req);
	}
	
	@PutMapping
	public String updUserTable(@RequestBody UserTable req) {
		
		return userTableService.updUserTable(req);
	}
	
	@DeleteMapping("{userId}")
	public String delUserTable(@PathVariable String userId) {
		
		return userTableService.delUserTable(userId);
	}
}
